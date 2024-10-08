package com.facebook.fxcropapp.ig;

import X.AnonymousClass0fD;
import X.C10206RoN;
import X.C11497SbK;
import X.C276544tV;
import X.Pxj;
import X.RVO;
import X.SCZ;
import X.SS4;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import com.facebook.fxcrop.SimpleCropView;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.ui.base.IgButton;

public class IgCropActivity extends IgFragmentActivity {
    public static final float A02 = ((float) RVO.A00(16));
    public SimpleCropView A00;
    public IgButton A01 = null;

    /* JADX WARNING: type inference failed for: r1v6, types: [android.os.AsyncTask, X.Q6o] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0H;
        String A0F;
        String A0D;
        int A002 = AnonymousClass0fD.A00(1392093188);
        if (!Pxj.A1V(this)) {
            i = 1608222977;
        } else {
            super.onCreate(bundle);
            setContentView((int) R.layout.simple_crop_activity_ig);
            String str = "";
            Uri uri = (Uri) getIntent().getParcelableExtra(str);
            SimpleCropView simpleCropView = (SimpleCropView) findViewById(R.id.simple_crop_view);
            this.A00 = simpleCropView;
            if (!(simpleCropView == null || uri == null)) {
                simpleCropView.setImageUri(uri);
            }
            TextView textView = (TextView) findViewById(R.id.cancel_button);
            if (textView != null) {
                C276544tV r0 = SS4.A03;
                String str2 = str;
                if (!(r0 == null || (A0D = r0.A0D()) == null)) {
                    str2 = A0D;
                }
                textView.setText(str2);
                C11497SbK.A01(textView, 16, this);
            }
            TextView textView2 = (TextView) findViewById(R.id.done_button);
            if (textView2 != null) {
                C276544tV r02 = SS4.A03;
                String str3 = str;
                if (!(r02 == null || (A0F = r02.A0F()) == null)) {
                    str3 = A0F;
                }
                textView2.setText(str3);
                C11497SbK.A01(textView2, 17, this);
            }
            IgButton igButton = (IgButton) findViewById(R.id.rotate_button);
            this.A01 = igButton;
            if (igButton != null) {
                C276544tV r03 = SS4.A03;
                if (!(r03 == null || (A0H = r03.A0H()) == null)) {
                    str = A0H;
                }
                igButton.setText(str);
                C11497SbK.A01(this.A01, 18, this);
                String A003 = SS4.A00(43);
                C10206RoN roN = new C10206RoN(this);
                ? asyncTask = new AsyncTask();
                asyncTask.A02 = A003;
                asyncTask.A01 = roN;
                asyncTask.A00 = null;
                asyncTask.execute(new Void[0]);
            }
            overridePendingTransition(R.anim.fxcrop_enter_from_bottom, R.anim.fxcrop_fade_out);
            SCZ.A01("ON_SHOWN_CROPPER");
            i = -48590405;
        }
        AnonymousClass0fD.A07(i, A002);
    }
}
