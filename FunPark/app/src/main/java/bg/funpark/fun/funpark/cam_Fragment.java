package bg.funpark.fun.funpark;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Menu;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;
import android.net.Uri;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;


import com.google.android.gms.internal.mp;

import java.io.IOException;

import static android.widget.VideoView.*;

/**
 * Created by Z0NEN on 10/22/2014.
 */
public class cam_Fragment extends Fragment {
    View rootview;


//    @Override
//    public View onCreateView(Bundle savedInstanceState) {
//        super.onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);
//        Intent video1 = new Intent(getActivity(), video.class);
//        startActivity(video1);
//
//
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intent video1 = new Intent(getActivity(), video.class);
        startActivity(video1);
        rootview = inflater.inflate(R.layout.cam_layout, container, false);
        return rootview;





}








}

