package com.example.animejourney.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.res.stringResource
import com.example.animejourney.R

data class AnimeTip (
    @StringRes val monthRes: Int,
    @StringRes val tipRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)


object AnimeTipsRepository {
    val allTips = listOf<AnimeTip>(
        AnimeTip(
            monthRes = R.string.tip1_month,
            tipRes = R.string.tip1_title,
            descriptionRes = R.string.tip1_description,
            imageRes = R.drawable.image1
        ),
        AnimeTip(
            monthRes = R.string.tip2_month,
            tipRes = R.string.tip2_title,
            descriptionRes = R.string.tip2_description,
            imageRes = R.drawable.image2
        ),
        AnimeTip(
            monthRes = R.string.tip3_month,
            tipRes = R.string.tip3_title,
            descriptionRes = R.string.tip3_description,
            imageRes = R.drawable.image3
        ),
        AnimeTip(
            monthRes = R.string.tip4_month,
            tipRes = R.string.tip4_title,
            descriptionRes = R.string.tip4_description,
            imageRes = R.drawable.image4
        ),
        AnimeTip(
            monthRes = R.string.tip5_month,
            tipRes = R.string.tip5_title,
            descriptionRes = R.string.tip5_description,
            imageRes = R.drawable.image5
        ),
        AnimeTip(
            monthRes = R.string.tip6_month,
            tipRes = R.string.tip6_title,
            descriptionRes = R.string.tip6_description,
            imageRes = R.drawable.image6
        ),
        AnimeTip(
            monthRes = R.string.tip7_month,
            tipRes = R.string.tip7_title,
            descriptionRes = R.string.tip7_description,
            imageRes = R.drawable.image7
        ),
        AnimeTip(
            monthRes = R.string.tip8_month,
            tipRes = R.string.tip8_title,
            descriptionRes = R.string.tip8_description,
            imageRes = R.drawable.image8
        ),
        AnimeTip(
            monthRes = R.string.tip9_month,
            tipRes = R.string.tip9_title,
            descriptionRes = R.string.tip9_description,
            imageRes = R.drawable.image9
        ),
        AnimeTip(
            monthRes = R.string.tip10_month,
            tipRes = R.string.tip10_title,
            descriptionRes = R.string.tip10_description,
            imageRes = R.drawable.image10
        ),
        AnimeTip(
            monthRes = R.string.tip11_month,
            tipRes = R.string.tip11_title,
            descriptionRes = R.string.tip11_description,
            imageRes = R.drawable.image11
        ),
        AnimeTip(
            monthRes = R.string.tip12_month,
            tipRes = R.string.tip12_title,
            descriptionRes = R.string.tip12_description,
            imageRes = R.drawable.image12
        )

    )
}


