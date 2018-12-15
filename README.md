# KUtils
Kotlin library with useful util methods for Android projects.

The list of available methods and classes:

  * General:
    - TAG()

  * Device & App info:
    - getVersion()
    - getReadableVersion()
    - getPackageName()
    - getManufacturer()
    - getModel()
    - getLanguage()
    - getLocale()
    - getCountry()
    - getScreenSize()
    - isLandscape()
    - isPortrait()
    - isTablet()

  * Activity:
    - showStatusBar()
    - hideStatusBar()

  * Fragments:
    - BaseFragment
    - BaseDialogFragment
    - BaseView
    - ErrorDialog

  * Fragment Transactions:
    - transaction()
    - addFragment()
    - removeFragment()
    - replaceFragment()
    - isFragmentInBackStack()
    - isFragmentVisible()
    - getFragmentByTag()

  * Network:
    - isInternet()
    - isWiFi()
    - isMobileNetwork()
    - isVPN()

  * View:
    - visible()
    - invisible()
    - gone()
    - clickable()
    - notClickable()

  * TextView:
    - setHtml()
    - selectable()
    - notSelectable()

  * EditText:
    - setCursorAtTheEnd()

  * Toast:
    - toastShort()
    - toastLong()

  * Keyboard:
    - showKeyboard()
    - hideKeyboard()

  * Log:
    - logV()
    - logD()
    - logI()
    - logE()
