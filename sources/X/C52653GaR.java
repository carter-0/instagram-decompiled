package X;

import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GaR  reason: case insensitive filesystem */
public final class C52653GaR implements C59627JQv {
    public 0sK A00;
    public 0sH A01;
    public final UserSession A02;
    public final C51979GAc A03;
    public final GDI A04;

    public final void CIG(AnonymousClass8ZN r13, C53452Gok gok, C2606046i r15, String str, List list) {
        String str2;
        ClipsMidCardSubtype clipsMidCardSubtype;
        ClipsMidCardType clipsMidCardType;
        String A30;
        AnonymousClass8ZN r9 = r13;
        XSE xse = null;
        String A0j = AnonymousClass7TG.A0j();
        0sH r5 = this.A01;
        C53452Gok gok2 = gok;
        C2606046i r6 = r15;
        List list2 = list;
        if (r5 != null) {
            r5.invoke(r6, list2, (Object) null, r9, gok2, A0j);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list2.iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                break;
            }
            1Xj A0n = C51968G9o.A0n(it);
            if (!(A0n == null || (A30 = A0n.A30()) == null)) {
                C51973G9u.A1F(A30, A1C);
            }
        }
        if (!(gok == null || (clipsMidCardType = gok.A04) == null)) {
            xse = I3w.A01(I7H.A00(clipsMidCardType));
        }
        UserSession userSession = this.A02;
        C51979GAc gAc = this.A03;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gAc, userSession), AnonymousClass000.A00(162));
        if (A0e.isSampled()) {
            C51979GAc.A01(A0e, gAc);
            C51965G9l.A1P(A0e, ((C267324bN) 00k.A0I(list2)).getId());
            C51965G9l.A1C(C54689HOu.A0F, A0e);
            String audioAssetId = r15.getAudioAssetId();
            0qQ.A0B(audioAssetId, 0);
            C51973G9u.A13(A0e, A0j, DbZ.A07(audioAssetId));
            A0e.AAe("media_list", A1C);
            A0e.A8M(xse, "midcard_type");
            if (!(gok == null || (clipsMidCardSubtype = gok.A03) == null)) {
                str2 = clipsMidCardSubtype.toString();
            }
            A0e.AAJ("midcard_subtype", str2);
            if (r13 == null) {
                r9 = AnonymousClass8ZN.CLIPS_VIEWER_MIDCARD;
            }
            C51971G9r.A16(r9, A0e, A0j);
            DbX.A1L(A0e);
        }
    }

    public final void CIF(28D r2, ClipsCameraCommandAction clipsCameraCommandAction, C2606046i r4) {
        0sK r0 = this.A00;
        if (r0 != null) {
            r0.invoke(r4, r2, clipsCameraCommandAction);
        }
    }

    public final void CJ7(C53452Gok gok, C2606046i r16, List list, 05G r18, boolean z) {
        String str;
        1Ln A0U;
        ClipsMidCardSubtype clipsMidCardSubtype;
        ClipsMidCardSubtype clipsMidCardSubtype2;
        ClipsMidCardType clipsMidCardType;
        String A30;
        GDI gdi = this.A04;
        C2606046i r9 = r16;
        boolean z2 = !C51973G9u.A1a((C62037KWw) gdi.A08.getValue(), r9.getAssetId(), false);
        XSE xse = null;
        AnonymousClass7TE.A1Z(new C59673JTe(r9, gdi, (AnonymousClass4D7) null, 36, z2), gdi.A03());
        r18.FIA(Boolean.valueOf(z2));
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            1Xj A0n = C51968G9o.A0n(it);
            if (!(A0n == null || (A30 = A0n.A30()) == null)) {
                C51973G9u.A1F(A30, A1C);
            }
        }
        if (!(gok == null || (clipsMidCardType = gok.A04) == null)) {
            xse = I3w.A01(I7H.A00(clipsMidCardType));
        }
        UserSession userSession = this.A02;
        C51979GAc gAc = this.A03;
        0wc A012 = AnonymousClass0kN.A01(gAc, userSession);
        if (z2) {
            A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(A012, "instagram_organic_audio_save_tap"), 297);
            if (DbT.A1Y(A0U)) {
                A0U.A0R("containermodule", gAc.getModuleName());
                A0U.A0Q("container_id", Long.valueOf(C51967G9n.A08(C51971G9r.A0n(0, r9.getAssetId()), 0)));
                A0U.A0S("media_list", A1C);
                A0U.A0M(xse, "midcard_type");
                if (!(gok == null || (clipsMidCardSubtype2 = gok.A03) == null)) {
                    str = clipsMidCardSubtype2.toString();
                }
                A0U.A0R("midcard_subtype", str);
                A0U.A0M(C55059HbU.A00(r9.Adv()), "audio_type");
            } else {
                return;
            }
        } else {
            A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(A012, "instagram_organic_audio_unsave_tap"), 298);
            if (DbT.A1Y(A0U)) {
                A0U.A0R("containermodule", gAc.getModuleName());
                A0U.A0Q("container_id", Long.valueOf(C51967G9n.A08(C51971G9r.A0n(0, r9.getAssetId()), 0)));
                A0U.A0S("media_list", A1C);
                A0U.A0M(xse, "midcard_type");
                if (!(gok == null || (clipsMidCardSubtype = gok.A03) == null)) {
                    str = clipsMidCardSubtype.toString();
                }
                A0U.A0R("midcard_subtype", str);
            } else {
                return;
            }
        }
        A0U.A0M(AnonymousClass8ZN.CLIPS_VIEWER_MIDCARD, "pivot_page_entry_point");
        A0U.Cgf();
    }

    public C52653GaR(UserSession userSession, GDI gdi, C51979GAc gAc) {
        this.A03 = gAc;
        this.A02 = userSession;
        this.A04 = gdi;
    }

    public final void Eb4(0sH r1) {
        this.A01 = r1;
    }

    public final void EbC(0sK r1) {
        this.A00 = r1;
    }
}
