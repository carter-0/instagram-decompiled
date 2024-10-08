package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.android.R;
import com.instagram.api.schemas.ReelTappableObjectType;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;

/* renamed from: X.32T  reason: invalid class name */
public final class AnonymousClass32T implements AnonymousClass32U {
    public C275794rx A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final AnonymousClass32V A04;
    public final AnonymousClass32W A05;
    public final AnonymousClass4D6 A06;

    public AnonymousClass32T(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4D6 r4, AnonymousClass4DU r5) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r5, 4);
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A06 = r4;
        this.A03 = r5;
        this.A04 = new AnonymousClass32V(fragmentActivity);
        this.A05 = new AnonymousClass32W(userSession);
    }

    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v2, types: [android.graphics.drawable.Drawable, java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r8v4 */
    public final void A02(View view, AnonymousClass4WK r26, C249693kD r27, String str) {
        String string;
        ? r8;
        Drawable drawable;
        C367608rH wXq;
        C52236GKd gKd;
        int i;
        long j;
        C7215Pzj pzj;
        String A2n;
        Long A0n;
        View view2 = view;
        0qQ.A0B(view2, 0);
        AnonymousClass4WK r82 = r26;
        0qQ.A0B(r82, 1);
        C249693kD r2 = r27;
        0qQ.A0B(r2, 2);
        String str2 = str;
        0qQ.A0B(str2, 3);
        UserSession userSession = this.A02;
        AnonymousClass4DU r9 = this.A03;
        1Xj BPf = r2.BPf();
        boolean CcZ = r82.CcZ();
        0wc A012 = AnonymousClass0kN.A01(r9, userSession);
        0Aj A002 = A012.A00(A012.A00, AnonymousClass000.A00(3367));
        if (A002.isSampled()) {
            if (CcZ) {
                gKd = C52236GKd.A1A;
                i = 5249;
            } else {
                gKd = C52236GKd.A1B;
                i = 5257;
            }
            String A003 = AnonymousClass000.A00(i);
            A002.AAJ("containermodule", r9.getModuleName());
            if (BPf == null || (A2n = BPf.A2n()) == null || (A0n = 00y.A0n(10, A2n)) == null) {
                j = 0;
            } else {
                j = A0n.longValue();
            }
            A002.A9F("media_id", Long.valueOf(j));
            int i2 = 0;
            A002.A8k("media_index", 0);
            A002.AAJ("viewer_session_id", str2);
            A002.AAJ("link_format", AnonymousClass000.A00(379));
            A002.AAJ("link_type", A003);
            A002.A8M(gKd, "action");
            A002.A8M(AnonymousClass5OC.TEXT_STICKER, "action_source");
            C7215Pzj[] values = C7215Pzj.values();
            int length = values.length;
            while (true) {
                if (i2 >= length) {
                    pzj = null;
                    break;
                }
                pzj = values[i2];
                if (0qQ.A0K(pzj.A00, AnonymousClass1Q2.A02().getLanguage())) {
                    break;
                }
                i2++;
            }
            A002.A8M(pzj, "translated_language");
            A002.A7p(AnonymousClass000.A00(4982), true);
            A002.Cgf();
        }
        if (!182.A06(0Tu.A05, userSession, 36322920674765485L)) {
            Context context = view2.getContext();
            boolean CcZ2 = r82.CcZ();
            0qQ.A0A(context);
            C17489VXs vXs = new C17489VXs(context, new C66299MMi(r82, 47), new C66299MMi(r82, 48), CcZ2);
            ArrayList arrayList = new ArrayList();
            boolean z = vXs.A03;
            Context context2 = vXs.A00;
            if (z) {
                string = context2.getString(2131954774);
                0qQ.A07(string);
                r8 = 0;
                drawable = context2.getDrawable(R.drawable.instagram_translate_pano_filled_24);
                wXq = new C19396WXp(vXs);
            } else {
                string = context2.getString(2131954775);
                0qQ.A07(string);
                r8 = 0;
                drawable = context2.getDrawable(R.drawable.instagram_translate_pano_filled_24);
                wXq = new C19397WXq(vXs);
            }
            int i3 = 0;
            arrayList.add(new C367618rI(r8, drawable, r8, wXq, r8, string, 0, 0, 0, false, false, false, true, false, false, false));
            C355148Ov r4 = new C355148Ov(context, userSession, r8, false);
            r4.A02(arrayList);
            0eP A004 = r4.A00();
            0qQ.A0B(context, 0);
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            int i4 = iArr[1];
            int intValue = ((Number) A004.A00).intValue();
            int intValue2 = ((Number) A004.A01).intValue();
            int width = (view2.getWidth() / 2) - (intValue / 2);
            if (i4 > AnonymousClass0nB.A00(context) / 2) {
                i3 = -(view2.getHeight() + intValue2);
            }
            0eP r1 = new 0eP(Integer.valueOf(width), Integer.valueOf(i3));
            r4.showAsDropDown(view2, ((Number) r1.A00).intValue(), ((Number) r1.A01).intValue(), 8388611);
            if (r4.isShowing()) {
                r4.getContentView().postDelayed(new C57732IfZ(r4), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            }
        }
    }

    public final void A03(Fragment fragment, 1Xj r13, PromptStickerModel promptStickerModel, String str) {
        PromptStickerModel promptStickerModel2 = promptStickerModel;
        0qQ.A0B(promptStickerModel, 1);
        String str2 = str;
        0qQ.A0B(str, 3);
        UserSession userSession = this.A02;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36330716040020709L)) {
            A01();
        } else if (promptStickerModel.A01 != 0) {
        } else {
            if (182.A06(r2, userSession, 36314837546109756L)) {
                1Xj r4 = r13;
                if (r13 != null) {
                    C52086GEg.A0a(this.A03, userSession, r4, promptStickerModel.A03, ReelTappableObjectType.A0e.A00, str2);
                } else {
                    0wb.A03("ClipsInteractiveController", "Unable to log prompt sticker button click due to null media");
                }
                I3M.A02(this.A01, fragment, 28D.A0l, userSession, r13, promptStickerModel2);
                return;
            }
            A00();
        }
    }

    public final void A04(AnonymousClass8ZN r9, 1Xj r10, PromptStickerModel promptStickerModel, String str) {
        0qQ.A0B(promptStickerModel, 0);
        String str2 = str;
        0qQ.A0B(str, 2);
        0qQ.A0B(r9, 3);
        UserSession userSession = this.A02;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36330716040020709L)) {
            A01();
        } else if (promptStickerModel.A01 == 0 && 182.A06(r2, userSession, 2342157846760065855L)) {
            if (182.A06(r2, userSession, 36314837546109756L)) {
                String str3 = null;
                1Xj r4 = r10;
                if (r10 != null) {
                    C52086GEg.A0a(this.A03, userSession, r4, promptStickerModel.A03, ReelTappableObjectType.A0e.A00, str2);
                    str3 = r10.getId();
                } else {
                    0wb.A03("ClipsInteractiveController", "Unable to log prompt sticker click due to null media");
                }
                Bundle A002 = A0P.A00(r9, promptStickerModel, str3);
                FragmentActivity fragmentActivity = this.A01;
                new AnonymousClass6W8(fragmentActivity, A002, userSession, ModalActivity.class, C273654mx.A00(127)).A0C(fragmentActivity);
                return;
            }
            A00();
        }
    }

    public final void A05(C310256ag r13, C249693kD r14, C265924Wv r15, C19471WaJ waJ, int i) {
        0qQ.A0B(r14, 0);
        C19471WaJ waJ2 = waJ;
        0qQ.A0B(waJ2, 1);
        0qQ.A0B(r15, 3);
        1Xj BPf = r14.BPf();
        if (BPf != null) {
            UserSession userSession = this.A02;
            String A30 = BPf.A30();
            if (A30 != null) {
                int i2 = i;
                C265894Ws.A02(userSession, waJ2, A30, this.A03.getModuleName(), C2606846q.A00(BPf.A2L()), "", i2);
                W41 w41 = new W41(r15, waJ2, i2);
                if (r13 != null) {
                    int A002 = waJ2.A00();
                    View view = r15.A01;
                    if (i2 == A002) {
                        if (view != null) {
                            r13.A04(w41, view, false, true);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else if (view != null) {
                        r13.A03(w41, view);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                r15.A01(i2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A06(C265804Wi r4, C45419Cvz cvz) {
        0qQ.A0B(cvz, 0);
        0qQ.A0B(r4, 1);
        AnonymousClass6UJ.A01(this.A02, this.A06, cvz);
        r4.A06.post(new C20225WnP(r4, this.A04));
    }

    public final void A07(C272024jy r14, C265854Wo r15, String str, String str2, int i) {
        0qQ.A0B(r15, 0);
        C272024jy r4 = r14;
        0qQ.A0B(r14, 1);
        String str3 = str;
        if (str != null) {
            String str4 = str2;
            if (str2 != null) {
                Context applicationContext = this.A01.getApplicationContext();
                0qQ.A07(applicationContext);
                UserSession userSession = this.A02;
                C297825sP.A01(applicationContext, userSession, r4, (Integer) null, Integer.valueOf(i), str3, this.A03.getModuleName(), str4, "", -1, false);
                r15.Ext(userSession, DI9.A00);
                AnonymousClass5Gv r0 = this.A04.A00;
                if (r0 != null) {
                    r0.A08(true);
                }
            }
        }
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DW8(int i, int i2) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final void DhU(Integer num) {
        C275794rx r1 = this.A00;
        if (r1 != null) {
            r1.A03 = null;
            r1.A03(true);
            this.A00 = null;
        }
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    private final void A00() {
        C310336ap r2 = new C310336ap();
        r2.A05();
        r2.A0H = AnonymousClass000.A00(3814);
        r2.A0D = this.A01.getApplicationContext().getString(2131970837);
        r2.A06();
        1xC.A01.A00(new AnonymousClass3GP(r2.A00()));
    }

    private final void A01() {
        C310336ap r2 = new C310336ap();
        r2.A04();
        r2.A0H = "prompt_button_unship_toast";
        r2.A0D = this.A01.getApplicationContext().getString(2131970901);
        r2.A06();
        1xC.A01.A00(new AnonymousClass3GP(r2.A00()));
    }
}
