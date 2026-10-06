# BlitZ Android App

Native Android project for the BlitZ key-verification app.

Included:
- BlitZ branding and supplied DP
- Native Android rain animation
- Supplied MP3 bundled in `app/src/main/res/raw/blitz_music.mp3`
- Demo key verification
- Android ID shown as a HWID-style identifier
- Play Store-ready applicationId structure

Demo keys:
- `BLITZ-DEMO-2026`
- `BLITZ-PRO-2026`

## Important
The included verifier is intentionally a local demo. For a real production key system, move key validation to a secure server/API; never ship a master key list in the APK. Add authentication, key expiry, revocation, rate limiting and server-side device binding.

## Build
Open this folder in Android Studio and let Gradle sync. Then use:
Build > Generate App Bundle(s) / APK(s)

For Play Store publishing, create a signed release App Bundle (.aab) and complete the Play Console requirements.
