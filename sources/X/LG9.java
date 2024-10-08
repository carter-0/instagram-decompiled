package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.Map;

public final class LG9 {
    public final MVP A00;
    public final C65499LuN A01;
    public final String A02;
    public final Context A03;
    public final UserSession A04;
    public final C3499682q A05;
    public final C65146LoA A06;
    public final AnonymousClass3Q2 A07;

    public final void A01(C62642Kk4 kk4, C66569MWx mWx) {
        MVP mvp = this.A00;
        C65499LuN luN = this.A01;
        mvp.EuQ(luN, true);
        luN.A03(mWx);
        luN.A00 = kk4;
        luN.A07.A0G = kk4;
    }

    public LG9(Activity activity, Context context, ImageView imageView, AnonymousClass4DH r24, UserSession userSession, C3499682q r26, MVP mvp, AnonymousClass3Q2 r28, C267834cI r29, int i, boolean z) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1O(userSession2, context2);
        AnonymousClass3Q2 r9 = r28;
        0qQ.A0B(r9, 5);
        this.A04 = userSession2;
        this.A03 = context2;
        this.A07 = r9;
        this.A00 = mvp;
        C3499682q r8 = r26;
        this.A05 = r8;
        String A012 = JZM.A01(userSession2);
        this.A02 = A012;
        this.A01 = new C65499LuN(context2, imageView, r24, userSession2, r8, r9, r29, A012, new MP4(this, 38), i);
        Activity activity2 = activity;
        Context context3 = context2;
        UserSession userSession3 = userSession2;
        C3499682q r14 = r8;
        this.A06 = new C65146LoA(activity2, context3, userSession3, r14, new LnT(this), new C65144Lo6(this), r9, C59917Jbg.A00(this, 12), z);
    }

    public final void A00(ImageView imageView) {
        ImageUrl imageUrl;
        Drawable drawable;
        C65499LuN luN = this.A01;
        MusicOverlayStickerModel musicOverlayStickerModel = luN.A08.A1J;
        if (musicOverlayStickerModel != null) {
            imageUrl = musicOverlayStickerModel.A03;
        } else {
            imageUrl = null;
        }
        Context context = luN.A05;
        if (imageUrl == null) {
            drawable = context.getDrawable(luN.A04);
            if (drawable == null) {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            drawable = C63350KvX.A00(context, imageUrl);
        }
        imageView.setImageDrawable(drawable);
        Context context2 = this.A03;
        DbU.A12(context2, imageView, 2131967745);
        2eK.A00(imageView, context2.getColor(2Yu.A0B(context2)), AnonymousClass7TF.A03(context2, R.attr.igds_color_creation_tools_blue), 255);
        LYF.A01(imageView, 11, this);
    }

    public final void A02(C62642Kk4 kk4, Integer num) {
        if (AnonymousClass30D.A0K(this.A04, AnonymousClass7TF.A1W(this.A07.A1G, 1iA.A09), this.A05.CL3())) {
            this.A00.E2A();
        }
        this.A00.DSl();
        this.A06.Exg(kk4, (C371088xY) null, (AudioOverlayTrack) null, num, (String) null, (Map) null);
    }
}
