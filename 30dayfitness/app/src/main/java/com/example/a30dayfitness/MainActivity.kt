package com.example.a30dayfitness

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.Alignment
import com.example.a30dayfitness.ui.theme.FitnessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                  FitnessApp()
                }
            }
        }
    }
}

@Composable
fun FitnessApp(){


}

@Composable
fun FitnessItem(){


}

@Composable
private fun FitnessItemButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
)
{
    IconButton(
        onClick = onClick,
        modifier = modifier
    ){

       androidx.compose.material3.Icon(
           imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
           contentDescription = null ,
           tint = MaterialTheme.colorScheme.secondary

       )
    }
}

@Composable
fun FitnessIcon(
    @DrawableRes fitnessIcon: Int,
    modifier: Modifier = Modifier
)
{

  Image(
      modifier = modifier
          .size(dimensionResource(id = R.dimen.image_size))
          .padding(dimensionResource(id = R.dimen.padding_small))
          .clip(MaterialTheme.shapes.small),
      contentScale = ContentScale.Crop,
      painter = painterResource(fitnessIcon),
      contentDescription = null
      )
}

@Composable
fun FitnessInfo(
    @StringRes fitnessName : Int,
    day : Int,
    modifier: Modifier = Modifier
)
{

    Column(modifier = modifier){
        Text(
            text = stringResource(fitnessName),
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(top = dimensionResource(id = R.dimen.padding_small))
        )

        Text(
            text = stringResource(R.string.description, day),
            style = MaterialTheme.typography.bodyLarge

        )
    }

}



@Preview(showBackground = true)
@Composable
fun FitnessAppPreview() {
    FitnessTheme {
        FitnessApp()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FitnessAppTopBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
Row(verticalAlignment = Alignment.CenterVertically){
    Image(
        modifier = Modifier
            .size(dimensionResource(id = R.dimen.image_size))
            .padding(dimensionResource(id = R.dimen.padding_small)),
        painter = painterResource(id = R.drawable.muscleup),
        contentDescription = null

    )
    Text(
        text = stringResource(id = R.string.app_name),
        style = MaterialTheme.typography.displayLarge
    )
}

        },
        modifier = modifier
    )
}

@Composable
fun FitnessDesc(
    @StringRes fitnessDesc : Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = stringResource(id = R.string.description),
            style = MaterialTheme.typography.labelSmall
        )

        Text(
            text = stringResource(fitnessDesc),
            style = MaterialTheme.typography.bodyLarge
        )

    }
}