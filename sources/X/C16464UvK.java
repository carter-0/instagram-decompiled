package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.instagram.api.schemas.GuideMediaType;
import com.instagram.common.session.UserSession;
import com.instagram.guides.intf.model.MinimalGuide;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.io.File;
import java.io.IOException;

/* renamed from: X.UvK  reason: case insensitive filesystem */
public final class C16464UvK extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelGuideShareFragment";
    public RectF A00;
    public RectF A01;
    public C298785u1 A02;
    public PendingRecipient A03;
    public File A04;
    public final C41837B2s A05 = new WUP(this, 19);

    public final String getModuleName() {
        return "reel_guide_share_fragment";
    }

    /* JADX WARNING: type inference failed for: r11v4, types: [X.5u1, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        C298785u1 r11;
        1Xj A0U;
        BIR bir;
        1Xj r1;
        User user;
        int A022 = AnonymousClass0fD.A02(-791908165);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = (RectF) requireArguments.getParcelable("ReelGuideShareFragment.ARGUMENTS_KEY_ENTRY_VIEW_BOUNDS");
        this.A01 = (RectF) requireArguments.getParcelable("ReelGuideShareFragment.ARGUMENTS_KEY_EXIT_VIEW_BOUNDS");
        String string = requireArguments.getString("ReelGuideShareFragment.ARGUMENTS_KEY_BACKGROUND_FILE_PATH");
        if (string != null) {
            this.A04 = new File(string);
            this.A03 = (PendingRecipient) requireArguments.getParcelable("ReelGuideShareFragment.ARGUMENTS_KEY_TARGET_GROUP_PROFILE");
            Parcelable parcelable = requireArguments.getParcelable("ReelGuideShareFragment.ARGUMENTS_KEY_ENTRY_POINT");
            if (parcelable != null) {
                MinimalGuide minimalGuide = (MinimalGuide) parcelable;
                UserSession userSession = this.A00;
                DbS.A1Z(userSession);
                String str = minimalGuide.A07;
                User user2 = null;
                if (TextUtils.isEmpty(str) || (user = DbV.A0j(userSession, str)) == null) {
                    try {
                        String str2 = minimalGuide.A0B;
                        if (str2 != null) {
                            Parcelable.Creator creator = User.CREATOR;
                            user = 1aC.A04(str2);
                            if (user != null) {
                                17h.A00(userSession).A01(user, false, false);
                            }
                        }
                    } catch (IOException unused) {
                    }
                    r11 = null;
                    this.A02 = r11;
                    AnonymousClass0fD.A09(1196168805, A022);
                    return;
                }
                user2 = user;
                if (user2 != null) {
                    String str3 = minimalGuide.A05;
                    C48107EVz A002 = VE6.A00(minimalGuide.A06);
                    String str4 = minimalGuide.A09;
                    String str5 = minimalGuide.A03;
                    String str6 = minimalGuide.A04;
                    if (TextUtils.isEmpty(str6)) {
                        A0U = null;
                    } else {
                        A0U = DbV.A0U(userSession, str6);
                    }
                    String str7 = minimalGuide.A02;
                    BIR bir2 = null;
                    if (!TextUtils.isEmpty(str7)) {
                        0qQ.A0B(userSession, 0);
                        VS9 vs9 = (VS9) userSession.A01(VS9.class, new C45999DId(userSession, 4));
                        if (str7 == null) {
                            bir = null;
                        } else {
                            bir = (BIR) vs9.A00.get(str7);
                        }
                        if (bir == null) {
                            1Xj A0U2 = DbV.A0U(userSession, str7);
                            if (A0U2 != null) {
                                bir = new BIR(GuideMediaType.IG_MEDIA, new BIQ((C42046BEz) null, A0U2));
                            }
                            try {
                                String str8 = minimalGuide.A0A;
                                if (!(str8 == null || (bir = D1H.parseFromJson(16P.A00(str8))) == null || (r1 = bir.A01.A01) == null)) {
                                    1E7.A00(userSession).A00(r1);
                                }
                                bir2 = bir;
                            } catch (IOException unused2) {
                            }
                            bir = bir2;
                        }
                    } else {
                        bir = null;
                        String str82 = minimalGuide.A0A;
                        1E7.A00(userSession).A00(r1);
                        bir2 = bir;
                        bir = bir2;
                    }
                    Integer num = minimalGuide.A00;
                    boolean z = minimalGuide.A0C;
                    Long l = minimalGuide.A01;
                    boolean z2 = minimalGuide.A0D;
                    boolean z3 = minimalGuide.A0E;
                    ? obj = new Object();
                    obj.A07 = str3;
                    obj.A02 = A002;
                    obj.A03 = user2;
                    obj.A08 = str4;
                    obj.A06 = str5;
                    obj.A01 = A0U;
                    obj.A00 = bir;
                    obj.A04 = num;
                    obj.A09 = z;
                    obj.A05 = l;
                    obj.A0A = z2;
                    obj.A0B = z3;
                    r11 = obj;
                    this.A02 = r11;
                    AnonymousClass0fD.A09(1196168805, A022);
                    return;
                }
                r11 = null;
                this.A02 = r11;
                AnonymousClass0fD.A09(1196168805, A022);
                return;
            }
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -1957852250;
        } else {
            illegalStateException = new IllegalStateException("Required value was null.");
            i = 59041109;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final void onResume() {
        File file;
        int A022 = AnonymousClass0fD.A02(975800714);
        super.onResume();
        C298785u1 r0 = this.A02;
        if (r0 == null || r0.A00 == null || (file = this.A04) == null || !file.exists()) {
            VJ3.A00(this);
        }
        AnonymousClass0fD.A09(733501762, A022);
    }
}
