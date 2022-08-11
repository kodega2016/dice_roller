### Simple Android Application for learning purposes

#### Find view in the android and inflate the layout
We can find or select the component by using id in the android and  can add or update the its properties.

#### Vector Drawable Support
- add to build.gradle
    vectorDrawables.useSupportLibrary=true

- use correct layout namespace
    xmlns:app="http://schemas.android.com/apk/res-auto"

- change src to srcCompat
    app:srcCompat="@drawable/empty_dice