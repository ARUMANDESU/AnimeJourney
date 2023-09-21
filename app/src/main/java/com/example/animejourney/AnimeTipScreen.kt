package com.example.animejourney

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.animejourney.model.AnimeTip
import com.example.animejourney.model.AnimeTipsRepository
import com.example.animejourney.ui.theme.AnimeJourneyTheme


/**
 * Composable that displays anime tip list item
 * @param tip object containing information about the anime tip to be displayed
 * @param modifier modifiers to apply to this composable.
 * */
@Composable
fun AnimeTipItem(
    tip:AnimeTip,
    modifier: Modifier = Modifier,
){
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.tertiaryContainer,
            contentColor = MaterialTheme.colorScheme.onTertiaryContainer
        )
    ) {
        Column(
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium))
        ) {
            Text(
                text = stringResource(tip.monthRes),
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = stringResource(tip.tipRes),
                style = MaterialTheme.typography.bodyLarge
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(dimensionResource(R.dimen.image_medium))
                    .padding(
                        top = dimensionResource(R.dimen.padding_small),
                        bottom = dimensionResource(R.dimen.padding_small),
                    )
            ){
                Image(
                    painter = painterResource(tip.imageRes),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxWidth(),
                )
            }

            Text(
                text = stringResource(tip.descriptionRes),
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}


@Preview("Light theme")
@Preview("Dark theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun AnimeTipItemPreview(){
    AnimeJourneyTheme {
        AnimeTipItem(tip = AnimeTipsRepository.allTips[0])
    }
}