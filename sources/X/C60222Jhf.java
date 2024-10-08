package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jhf  reason: case insensitive filesystem */
public final class C60222Jhf extends 2YL {
    public 1Xj A00;
    public Map A01 = AnonymousClass7TE.A1H();
    public final 2Fk A02;
    public final XIGIGBoostCallToAction A03;
    public final XIGIGBoostDestination A04;
    public final UserSession A05;
    public final AudioOverlayTrack A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final C63834L8p A0H;

    public C60222Jhf(XIGIGBoostCallToAction xIGIGBoostCallToAction, XIGIGBoostDestination xIGIGBoostDestination, C63834L8p l8p, UserSession userSession, AudioOverlayTrack audioOverlayTrack, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        UserSession userSession2 = userSession;
        String str3 = str;
        XIGIGBoostDestination xIGIGBoostDestination2 = xIGIGBoostDestination;
        AnonymousClass7TG.A0w(1, userSession2, xIGIGBoostDestination2, str3);
        this.A05 = userSession2;
        C63834L8p l8p2 = l8p;
        this.A0H = l8p2;
        this.A04 = xIGIGBoostDestination2;
        this.A07 = str3;
        this.A03 = xIGIGBoostCallToAction;
        List list2 = list;
        this.A09 = list2;
        this.A0C = z;
        this.A0D = z2;
        this.A0B = z3;
        this.A0F = z4;
        this.A0G = z5;
        this.A0E = z6;
        this.A08 = str2;
        this.A06 = audioOverlayTrack;
        this.A00 = 1E7.A00(userSession2).A02(002.A0T(str3, userSession2.A06, '_'));
        this.A0A = C305936Kd.A04(xIGIGBoostDestination2, userSession2, list2);
        2IS A042 = C41845B3m.A04();
        2IS A043 = C41845B3m.A04();
        UserSession userSession3 = l8p2.A01;
        A042.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, userSession3.A06);
        A042.A04("media_id", l8p2.A03);
        A042.A04(C66579MXk.A00(265), l8p2.A02);
        A042.A05(C273654mx.A00(2882), l8p2.A00);
        A042.A05(AnonymousClass000.A00(5177), ImmutableList.copyOf((Collection) l8p2.A04));
        1vn A012 = 1vm.A01(userSession3);
        ArrayList A1C = AnonymousClass7TE.A1C();
        MCA A002 = MCA.A00(this, MC9.A00(new MCA((0sL) new MGZ(l8p2, (AnonymousClass4D7) null, 34), (AnonymousClass0r6) A012.A05(new PandoGraphQLRequest(C41845B3m.A05(), AnonymousClass000.A00(2295), A042.getParamsCopy(), A043.getParamsCopy(), C7814QXz.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xig_user_by_igid_v2", A1C)), 24), 20), 21);
        this.A02 = DbT.A0G(10b.A02(new C53258Gl6((C61017JvH) null, true), C318116oQ.A00(this), A002, AnonymousClass10A.A00));
    }
}
