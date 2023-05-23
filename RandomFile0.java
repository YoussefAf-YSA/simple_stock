private void startPlayer(String url) {
        boolean exist = checkPlayer();

        if(exist) {
            Intent intent = context.getPackageManager().getLaunchIntentForPackage("com.sp.player");
            intent.putExtra("url", url);
            intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            context.startActivity(intent);
        }else{
            Log.d("tester", "Play doesn't exist !");
        }
    }

private boolean checkPlayer() {
        try {
            context.getPackageManager().getPackageInfo("com.sp.player", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
