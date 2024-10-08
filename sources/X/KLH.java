package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.user.model.User;
import java.util.Map;

public final class KLH extends AnonymousClass8D8 {
    public C299875vz A00;
    public ProfileStickerModel A01;
    public boolean A02;
    public boolean A03;
    public C62320sa A04 = new C41656Ay8(this, 7);
    public final Context A05;
    public final UserSession A06;
    public final AnonymousClass07i A07;
    public final AnonymousClass0iw A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KLH(Context context, AnonymousClass07i r19, AnonymousClass0iw r20, UserSession userSession, AnonymousClass8BA r22, ProfileStickerModel profileStickerModel) {
        super(r22, (AnonymousClass8BH) null, (Integer) null, 111, false, false);
        C299875vz r0;
        Context context2 = context;
        this.A05 = context2;
        UserSession userSession2 = userSession;
        this.A06 = userSession2;
        AnonymousClass07i r8 = r19;
        this.A07 = r8;
        AnonymousClass0iw r9 = r20;
        this.A08 = r9;
        ProfileStickerModel profileStickerModel2 = profileStickerModel;
        this.A01 = profileStickerModel2;
        User user = profileStickerModel2.A03;
        if (user == null) {
            return;
        }
        if (AnonymousClass7TF.A1Y(user.A0K(), true)) {
            A01(this);
            return;
        }
        ProfileStickerModel profileStickerModel3 = this.A01;
        C61076JwE[] jwEArr = profileStickerModel3.A00;
        if (jwEArr == null || jwEArr.length == 0) {
            this.A03 = true;
            KAR kar = new KAR(1, r9, new C64617Lf3(5, new C61076JwE[3], this), this);
            C228602lw r3 = new C228602lw(context2, r8, (Integer) null);
            1NY A0b = AnonymousClass7TG.A0b(userSession2);
            A0b.A9m(AnonymousClass000.A00(3285), user.getId());
            A0b.A0A(AnonymousClass000.A00(2739));
            1OC A0R = DbT.A0R((15p) null, A0b, 1XO.class, 1XW.class, false);
            A0R.A00 = kar;
            r3.schedule(A0R);
            return;
        }
        if (profileStickerModel3.A06) {
            r0 = new C389569pq(context2, profileStickerModel3);
        } else {
            r0 = new C389579pr(context2, userSession2, profileStickerModel3);
        }
        this.A00 = r0;
    }

    public static final void A01(KLH klh) {
        C268694dq r2;
        klh.A03 = false;
        ProfileStickerModel profileStickerModel = klh.A01;
        int intValue = profileStickerModel.A04.intValue();
        if (intValue == 0) {
            r2 = new C389569pq(klh.A05, profileStickerModel);
        } else if (intValue == 1) {
            C389579pr r22 = new C389579pr(klh.A05, klh.A06, profileStickerModel);
            r22.A00 = true;
            r2 = r22;
        } else if (intValue == 2) {
            r2 = new C389599pt(klh.A05, klh.A06, profileStickerModel);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        klh.A00 = (C299875vz) r2;
        if (klh.A02) {
            klh.A07();
        }
    }

    public final Integer A05() {
        if (this.A01.A06) {
            return AnonymousClass05K.A07;
        }
        return AnonymousClass05K.A0O;
    }

    public final Map A06() {
        String A002;
        C299875vz r2 = this.A00;
        if (r2 == null) {
            0qQ.A0F("profileStickerDrawable");
            throw AnonymousClass00P.createAndThrow();
        }
        int intValue = this.A01.A04.intValue();
        if (intValue == 0) {
            A002 = AnonymousClass000.A00(3970);
        } else if (intValue == 1) {
            A002 = "profile_sticker";
        } else if (intValue == 2) {
            A002 = "ai_agent_profile_sticker";
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return AnonymousClass7TF.A0w(r2, AnonymousClass7TE.A1I(A002));
    }

    public final void A07() {
        if (!this.A03) {
            this.A04.invoke();
        }
        this.A02 = true;
    }
}
