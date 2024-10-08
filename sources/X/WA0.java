package X;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.instagram.modal.TransparentModalActivity;

public final class WA0 implements View.OnClickListener {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C19477WaP A01;
    public final /* synthetic */ AnonymousClass17L A02;
    public final /* synthetic */ C14211Trq A03;

    public WA0(ImageView imageView, C19477WaP waP, AnonymousClass17L r3, C14211Trq trq) {
        this.A03 = trq;
        this.A00 = imageView;
        this.A02 = r3;
        this.A01 = waP;
    }

    public final void onClick(View view) {
        IllegalStateException illegalStateException;
        int i;
        int A05 = AnonymousClass0fD.A05(-1747318696);
        Bundle bundle = new Bundle();
        AnonymousClass17L r2 = this.A02;
        C14211Trq trq = this.A03;
        C19477WaP waP = this.A01;
        bundle.putString("CREATOR_PROFILE_PICTURE_URL", r2.Bh3().getUrl());
        bundle.putString("CREATOR_USERNAME", r2.getUsername());
        String str = trq.A0E;
        if (str != null) {
            bundle.putString("MEDIA_ID", str);
            String str2 = waP.A00.A08;
            if (str2 != null) {
                bundle.putString("QUESTION_ID", str2);
                bundle.putString("REEL_VIEWER_NAME", trq.A0O);
                bundle.putString("MEDIA_DELIVERY_CLASS", trq.A0D);
                bundle.putString("TRAY_SESSION_ID", trq.A0P);
                bundle.putInt("TRAY_POSITION", trq.A00);
                0qQ.A0A(view);
                bundle.putParcelable(C66579MXk.A00(55), 0nA.A0F(view));
                DbU.A0x(trq.A0J, bundle, trq.A0K, TransparentModalActivity.class, C273654mx.A00(3237));
                trq.A0Q.add(this.A00);
                AnonymousClass0fD.A0C(-1018694077, A05);
                return;
            }
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -1718693779;
        } else {
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -2030455948;
        }
        AnonymousClass0fD.A0C(i, A05);
        throw illegalStateException;
    }
}
