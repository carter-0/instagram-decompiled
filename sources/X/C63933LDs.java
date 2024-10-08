package X;

import android.content.Context;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LDs  reason: case insensitive filesystem */
public final class C63933LDs {
    public final C3499682q A00;
    public final C65499LuN A01;
    public final MVQ A02;
    public final AnonymousClass3Q2 A03;
    public final String A04;
    public final AnonymousClass0eM A05;

    public C63933LDs(Context context, AnonymousClass4DH r13, UserSession userSession, C3499682q r15, MVQ mvq, AnonymousClass3Q2 r17, String str) {
        C267834cI r7;
        UserSession userSession2 = userSession;
        String str2 = str;
        C51972G9s.A1C(userSession, str2);
        AnonymousClass3Q2 r6 = r17;
        0qQ.A0B(r6, 6);
        this.A04 = str2;
        this.A02 = mvq;
        this.A03 = r6;
        C3499682q r5 = r15;
        this.A00 = r15;
        String A012 = JZM.A01(userSession);
        MP4 mp4 = new MP4(this, 39);
        AnonymousClass4DH r3 = r13;
        C267834cI requireActivity = r13.requireActivity();
        if (requireActivity instanceof C267834cI) {
            r7 = requireActivity;
        } else {
            r7 = null;
        }
        this.A01 = new C65499LuN(context, (ImageView) null, r3, userSession2, r5, r6, r7, A012, mp4, R.drawable.instagram_music_pano_outline_24);
        this.A05 = AnonymousClass0eN.A01(new C58208IoC(35, context, this, r13, userSession));
    }

    public final void A00(C66569MWx mWx) {
        C65499LuN luN = this.A01;
        C371088xY r1 = C371088xY.POST_CAPTURE_AUDIO_BAR;
        luN.A01 = r1;
        luN.A07.A0H = r1;
        MVQ mvq = this.A02;
        mvq.DkR(luN);
        luN.A03(mWx);
        luN.onResume();
        mvq.Cp5();
    }
}
