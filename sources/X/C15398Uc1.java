package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat;
import com.instagram.model.keyword.Keyword;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Uc1  reason: case insensitive filesystem */
public final class C15398Uc1 extends C227812jx implements AnonymousClass4DU, C66526MVe, C74585PxY, AnonymousClass4DS, C74428Pui, XC1, XC2, XC4 {
    public static final String __redex_internal_original_name = "EditSearchHistoryFragment";
    public C15488Udd A00;
    public C358448av A01;
    public C14407Tva A02;
    public C14437TwL A03;
    public C59830Ja5 A04;
    public C14436TwK A05;
    public C19228WQj A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final AnonymousClass0eM A0B = C13998To0.A01(this, 18);
    public final AnonymousClass0eM A0C = C227642jf.A02(this);

    public final void D1s() {
        int i;
        int i2;
        C14407Tva tva = this.A02;
        String str = "searchTabType";
        if (tva != null) {
            int ordinal = tva.ordinal();
            if (ordinal == 1) {
                i = 2131955135;
                i2 = 2131955134;
            } else if (ordinal != 4) {
                i = 2131955148;
                i2 = 2131955147;
            } else {
                C59830Ja5 ja5 = this.A04;
                if (ja5 == null) {
                    str = "trackPreviewController";
                } else {
                    C13988Tno.A1K(ja5);
                    C15488Udd udd = this.A00;
                    if (udd == null) {
                        str = "editSearchHistoryAdapter";
                    } else {
                        udd.A00();
                        i = 2131955138;
                        i2 = 2131955137;
                    }
                }
            }
            Context requireContext = requireContext();
            UserSession A0l = AnonymousClass7TE.A0l(this.A0C);
            C14407Tva tva2 = this.A02;
            if (tva2 != null) {
                0qQ.A0B(A0l, 1);
                C358248ab r2 = new C358248ab(requireContext);
                r2.A09(i);
                r2.A08(i2);
                r2.A0I(new C18835W4z(4, requireContext, this, A0l, tva2), 2131955136);
                r2.A0H((DialogInterface.OnClickListener) null, 2131968513);
                DbT.A1V(r2);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D2H(Reel reel, AnonymousClass3N3 r2, C66967Mg0 mg0, C66632Ma1 ma1, boolean z) {
    }

    public final void DDm(C66967Mg0 mg0, C66632Ma1 ma1) {
    }

    public final void DMv(C67387Mn4 mn4, C66967Mg0 mg0) {
        Integer num;
        int i = mg0.A00;
        Keyword keyword = mn4.A01;
        0qQ.A0B(keyword, 0);
        if (!keyword.A0A || mg0.A0F) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        A02(mn4, num, i);
        if (!0qQ.A0K(mn4.A01.A07, "meta_ai_suggestion") || this.A09) {
            C14437TwL twL = this.A03;
            if (twL != null) {
                twL.A0B(mn4.A01.A04, (String) null, getModuleName(), (String) null, (String) null, "0", (String) null, C273654mx.A00(744), 0, true);
            }
            0qQ.A0F("searchNavigationController");
            throw AnonymousClass00P.createAndThrow();
        }
        C14437TwL twL2 = this.A03;
        if (twL2 != null) {
            twL2.A0A(C273654mx.A00(260), "", mn4.A01.A04, (String) null);
        }
        0qQ.A0F("searchNavigationController");
        throw AnonymousClass00P.createAndThrow();
        C14417Tvm.A00(AnonymousClass7TE.A0l(this.A0C)).A00(mn4.A01);
    }

    public final void DUo() {
    }

    public final void DiF(Integer num) {
    }

    public final void DwE(AnonymousClass0iw r1, C66967Mg0 mg0, C66632Ma1 ma1) {
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, getString(2131963007));
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C15488Udd udd = this.A00;
        if (udd != null) {
            setAdapter(udd);
            C15488Udd udd2 = this.A00;
            if (udd2 != null) {
                udd2.A00();
                return;
            }
        }
        0qQ.A0F("editSearchHistoryAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final C14198Trd A00(C15398Uc1 uc1) {
        List A022;
        List A023;
        List A024;
        List A1I;
        C14016ToI toI;
        C14407Tva tva = uc1.A02;
        if (tva == null) {
            0qQ.A0F("searchTabType");
            throw AnonymousClass00P.createAndThrow();
        }
        int ordinal = tva.ordinal();
        if (ordinal == 0) {
            01N A1H = 0jo.A1H();
            AnonymousClass0eM r5 = uc1.A0C;
            C14017ToJ A002 = C14025ToR.A00(AnonymousClass7TE.A0l(r5));
            synchronized (A002) {
                A022 = A002.A00.A02();
            }
            A1H.addAll(A022);
            C14419Tvo A003 = C14416Tvl.A00(AnonymousClass7TE.A0l(r5));
            synchronized (A003) {
                A023 = A003.A00.A02();
            }
            A1H.addAll(A023);
            A1H.addAll(C14415Tvk.A00(AnonymousClass7TE.A0l(r5)).A00.A02());
            C14420Tvp A004 = C14417Tvm.A00(AnonymousClass7TE.A0l(r5));
            synchronized (A004) {
                A024 = A004.A00.A02();
            }
            A1H.addAll(A024);
            if (AnonymousClass7TF.A1Z(uc1.A0B)) {
                A1H.addAll(C14433TwH.A00(AnonymousClass7TE.A0l(r5)).A00.A02());
            }
            01V.A1C(A1H);
            A1I = 0jo.A1I(A1H);
        } else if (ordinal != 1) {
            if (ordinal == 3) {
                toI = C14415Tvk.A00(AnonymousClass7TE.A0l(uc1.A0C)).A00;
            } else if (ordinal == 4) {
                toI = C14433TwH.A00(AnonymousClass7TE.A0l(uc1.A0C)).A00;
            } else {
                throw new IllegalStateException("Invalid EDIT_SEARCHES_TYPE");
            }
            A1I = toI.A02();
        } else {
            C14017ToJ A005 = C14025ToR.A00(AnonymousClass7TE.A0l(uc1.A0C));
            synchronized (A005) {
                A1I = A005.A00.A02();
            }
        }
        C14199Tre tre = new C14199Tre(false);
        if (AnonymousClass7TE.A1b(A1I)) {
            String A0m = DbU.A0m(uc1, 2131971359);
            Integer num = AnonymousClass05K.A00;
            Integer num2 = AnonymousClass05K.A0C;
            tre.A05(num2, new C61069Jw7(num, num2, A0m), new Object());
        }
        for (Object next : A1I) {
            C66966Mfz mfz = new C66966Mfz();
            mfz.A09 = "null_state_recent";
            mfz.A08 = "RECENT";
            mfz.A0F = true;
            mfz.A05 = C66582MXn.A0w("RECENT");
            tre.A03(mfz, next);
        }
        return tre.A01();
    }

    private final void A01(C66942Mfb mfb, C66967Mg0 mg0) {
        C358448av r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("searchLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.CkN("", mfb.A01(), mfb.A02(), mfb.A04(), mg0.A08, mg0.A00);
    }

    public final Integer C9C(C66569MWx mWx) {
        C59830Ja5 ja5 = this.A04;
        if (ja5 != null) {
            return ja5.A02.C9D(mWx.BUq());
        }
        0qQ.A0F("trackPreviewController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Cwp(C69159Nfi nfi, C66967Mg0 mg0) {
        String str;
        A02(nfi, AnonymousClass05K.A0C, mg0.A00);
        C59830Ja5 ja5 = this.A04;
        if (ja5 == null) {
            str = "trackPreviewController";
        } else {
            C13988Tno.A1K(ja5);
            C14437TwL twL = this.A03;
            if (twL == null) {
                str = "searchNavigationController";
            } else {
                C66569MWx A062 = nfi.A06();
                if (A062 != null) {
                    twL.A03(AnonymousClass8ZN.SEARCH_ROW, A062);
                    C14472Twu A002 = C14433TwH.A00(AnonymousClass7TE.A0l(this.A0C));
                    C66569MWx A063 = nfi.A06();
                    if (A063 != null) {
                        A002.A00(A063);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Cwq(C69159Nfi nfi, C66967Mg0 mg0) {
        String str;
        C59830Ja5 ja5 = this.A04;
        if (ja5 == null) {
            str = "trackPreviewController";
        } else {
            C13988Tno.A1K(ja5);
            A01(nfi, mg0);
            C14436TwK twK = this.A05;
            if (twK == null) {
                str = "hideSearchEntryController";
            } else {
                C66569MWx A062 = nfi.A06();
                if (A062 != null) {
                    twK.A04(A062, mg0);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D01(MusicAttributionConfig musicAttributionConfig) {
        C14437TwL twL = this.A03;
        if (twL == null) {
            0qQ.A0F("searchNavigationController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            twL.A08(musicAttributionConfig);
        }
    }

    public final void DIe(C69160Nfj nfj, C66967Mg0 mg0) {
        A02(nfj, AnonymousClass05K.A0C, mg0.A00);
        C14437TwL twL = this.A03;
        if (twL == null) {
            0qQ.A0F("searchNavigationController");
            throw AnonymousClass00P.createAndThrow();
        }
        twL.A06(nfj.A00, "", "", mg0.A00);
        C14416Tvl.A00(AnonymousClass7TE.A0l(this.A0C)).A00(nfj.A00);
    }

    public final void DXI(C69158Nfh nfh, C66967Mg0 mg0) {
        A02(nfh, AnonymousClass05K.A0C, mg0.A00);
        C14437TwL twL = this.A03;
        if (twL == null) {
            0qQ.A0F("searchNavigationController");
            throw AnonymousClass00P.createAndThrow();
        }
        twL.A07(nfh.A00, "", "", mg0.A00);
        C14418Tvn A002 = C14415Tvk.A00(AnonymousClass7TE.A0l(this.A0C));
        C18072Vl0 vl0 = nfh.A00;
        0qQ.A0B(vl0, 0);
        A002.A00.A04(vl0);
    }

    public final void DXQ(C66569MWx mWx, LBD lbd) {
        C59830Ja5 ja5 = this.A04;
        if (ja5 == null) {
            0qQ.A0F("trackPreviewController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            ja5.A00(mWx, lbd.A03);
        }
    }

    public final String getModuleName() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        0qQ.A0F("moduleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public final void onStopButtonClicked() {
        C59830Ja5 ja5 = this.A04;
        if (ja5 == null) {
            0qQ.A0F("trackPreviewController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C13988Tno.A1K(ja5);
        }
    }

    private final void A02(C66942Mfb mfb, Integer num, int i) {
        Integer num2;
        String str;
        OVV A002 = C70326O2e.A00(mfb);
        A002.A01 = "recent";
        A002.A07 = "null_state_recent";
        C14486Tx8 A012 = A002.A01();
        C358448av r3 = this.A01;
        if (r3 == null) {
            str = "searchLogger";
        } else {
            C14407Tva tva = this.A02;
            if (tva == null) {
                str = "searchTabType";
            } else {
                int ordinal = tva.ordinal();
                if (ordinal == 0) {
                    num2 = AnonymousClass05K.A01;
                } else if (ordinal == 1) {
                    num2 = AnonymousClass05K.A0N;
                } else if (ordinal == 2) {
                    num2 = AnonymousClass05K.A0C;
                } else if (ordinal != 3) {
                    num2 = AnonymousClass05K.A08;
                } else {
                    num2 = AnonymousClass05K.A0u;
                }
                r3.CkL(A012, num2, num, "", "", i);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D9S(AnonymousClass0iw r6, C66942Mfb mfb, C66967Mg0 mg0) {
        boolean A1Z = AnonymousClass7TG.A1Z(mfb, mg0);
        A01(mfb, mg0);
        int i = mfb.A01;
        if (i == 0) {
            C14436TwK twK = this.A05;
            if (twK != null) {
                User A062 = ((C66632Ma1) mfb).A06();
                C14407Tva tva = this.A02;
                if (tva != null) {
                    twK.A00(r6, mg0, tva, A062);
                    return;
                }
                0qQ.A0F("searchTabType");
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (i == A1Z) {
            C14436TwK twK2 = this.A05;
            if (twK2 != null) {
                twK2.A01(((C69160Nfj) mfb).A00, mg0, (C14407Tva) null);
                return;
            }
        } else if (i == 2) {
            C14436TwK twK3 = this.A05;
            if (twK3 != null) {
                twK3.A03(((C69158Nfh) mfb).A00, mg0, (C14407Tva) null);
                return;
            }
        } else if (i == 4) {
            C14436TwK twK4 = this.A05;
            if (twK4 != null) {
                Keyword keyword = ((C67387Mn4) mfb).A01;
                if (this.A02 != null) {
                    twK4.A02(keyword, mg0);
                    return;
                }
                0qQ.A0F("searchTabType");
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (i == 7) {
            C14436TwK twK5 = this.A05;
            if (twK5 != null) {
                C66569MWx A063 = ((C69159Nfi) mfb).A06();
                if (A063 != null) {
                    twK5.A04(A063, mg0);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        } else {
            throw new IllegalStateException("Invalid entry type");
        }
        0qQ.A0F("hideSearchEntryController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dw5(AnonymousClass0iw r5, C66967Mg0 mg0, C66632Ma1 ma1) {
        AnonymousClass7TG.A1N(ma1, mg0);
        A02(ma1, AnonymousClass05K.A0C, mg0.A00);
        C14437TwL twL = this.A03;
        if (twL == null) {
            0qQ.A0F("searchNavigationController");
            throw AnonymousClass00P.createAndThrow();
        }
        twL.A09(ma1.A06(), "", "", mg0.A00);
        C14025ToR.A00(AnonymousClass7TE.A0l(this.A0C)).A01(ma1.A06());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x008e, code lost:
        if (X.182.A06(r7, r9, 36318067361388382L) == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x006e, code lost:
        if (X.182.A06(X.0Tu.A05, X.AnonymousClass7TF.A0L(r4, 0), 36318067361322845L) == false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = -1719099711(0xffffffff99889ec1, float:-1.412619E-23)
            int r6 = X.AnonymousClass0fD.A02(r0)
            r12 = r20
            r0 = r21
            super.onCreate(r0)
            android.os.Bundle r3 = r12.requireArguments()
            java.lang.String r0 = "edit_recent"
            r12.setModuleNameV2(r0)
            java.lang.String r0 = "edit_searches_type"
            java.io.Serializable r1 = r3.getSerializable(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.model.SearchTabType"
            X.0qQ.A0C(r1, r0)
            X.Tva r1 = (X.C14407Tva) r1
            r12.A02 = r1
            android.content.Context r13 = r12.requireContext()
            X.0eM r4 = r12.A0C
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r4)
            android.content.Context r2 = r12.requireContext()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            X.2xu r0 = new X.2xu
            r0.<init>(r2, r1)
            java.lang.String r17 = "EditSearchHistoryFragment"
            r5 = 0
            r2 = 0
            boolean r18 = X.C234472xv.A02(r14)
            r15 = r5
            r16 = r0
            X.2xy r1 = X.C234472xv.A00(r13, r14, r15, r16, r17, r18)
            X.Ja5 r0 = new X.Ja5
            r0.<init>(r1)
            r12.A04 = r0
            X.Tva r0 = r12.A02
            java.lang.String r10 = "searchTabType"
            if (r0 == 0) goto L_0x0139
            X.Tva r8 = X.C14407Tva.AUDIO
            if (r0 != r8) goto L_0x0070
            X.0lg r9 = X.AnonymousClass7TF.A0L(r4, r2)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36318067361322845(0x8107170000175d, double:3.031030268195147E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            r16 = 1
            if (r0 != 0) goto L_0x0072
        L_0x0070:
            r16 = 0
        L_0x0072:
            X.0lg r9 = X.AnonymousClass7TF.A0L(r4, r2)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36318067361322845(0x8107170000175d, double:3.031030268195147E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 == 0) goto L_0x0090
            r0 = 36318067361388382(0x8107170001175e, double:3.0310302682365927E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            r17 = 1
            if (r0 != 0) goto L_0x0092
        L_0x0090:
            r17 = 0
        L_0x0092:
            X.Tva r0 = r12.A02
            if (r0 == 0) goto L_0x0139
            boolean r18 = X.AnonymousClass7TF.A1W(r0, r8)
            X.0lg r8 = X.AnonymousClass7TF.A0L(r4, r2)
            r0 = 36328340924611847(0x81106f00173d07, double:3.0375273109874306E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            r12.A0A = r0
            android.content.Context r11 = r12.requireContext()
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r4)
            X.Tva r14 = r12.A02
            if (r14 == 0) goto L_0x0139
            boolean r0 = r12.A0A
            X.Udd r10 = new X.Udd
            r15 = r12
            r19 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r12.A00 = r10
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r4)
            android.content.Context r1 = r12.requireContext()
            X.TwK r0 = new X.TwK
            r0.<init>(r1, r7, r5)
            r12.A05 = r0
            X.WQj r0 = new X.WQj
            r0.<init>(r12)
            r12.A06 = r0
            java.lang.String r0 = "argument_parent_module_name"
            java.lang.String r1 = X.JTP.A0m(r3, r0)
            java.lang.String r0 = "_edit_recent"
            java.lang.String r0 = X.002.A0R(r1, r0)
            r12.A07 = r0
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            java.lang.String r0 = "argument_search_session_id"
            java.lang.String r0 = r3.getString(r0, r1)
            r12.A08 = r0
            java.lang.String r0 = "shopping_session_id"
            r3.getString(r0)
            java.lang.String r0 = r12.A08
            java.lang.String r10 = "searchSessionId"
            if (r0 == 0) goto L_0x0139
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r4)
            androidx.fragment.app.FragmentActivity r14 = r12.requireActivity()
            r18 = 112(0x70, float:1.57E-43)
            X.TwL r13 = new X.TwL
            r19 = r2
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r12.A03 = r13
            java.lang.String r1 = r12.A08
            if (r1 == 0) goto L_0x0139
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.8av r0 = X.C358428at.A00(r12, r0, r1)
            r12.A01 = r0
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36328340924742921(0x81106f00193d09, double:3.037527311070322E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r12.A09 = r0
            r0 = 855599724(0x32ff6a6c, float:2.9734302E-8)
            X.AnonymousClass0fD.A09(r0, r6)
            return
        L_0x0139:
            X.0qQ.A0F(r10)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15398Uc1.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1131605784);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_search_history_rv, false);
        AnonymousClass0fD.A09(1055762646, A022);
        return A0D;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-304653481);
        C15398Uc1.super.onPause();
        C59830Ja5 ja5 = this.A04;
        if (ja5 == null) {
            0qQ.A0F("trackPreviewController");
            throw AnonymousClass00P.createAndThrow();
        }
        C13988Tno.A1K(ja5);
        AnonymousClass0fD.A09(814097651, A022);
    }

    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManagerCompat(JTT.A0B(this, recyclerView)));
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-2099263164);
        super.onResume();
        C15488Udd udd = this.A00;
        if (udd == null) {
            0qQ.A0F("editSearchHistoryAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        udd.A00 = A00(this);
        udd.A00();
        AnonymousClass0fD.A09(450553061, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1280138467);
        C15398Uc1.super.onStart();
        C14436TwK twK = this.A05;
        if (twK != null) {
            C19228WQj wQj = this.A06;
            if (wQj != null) {
                twK.A08.add(wQj);
                C14436TwK twK2 = this.A05;
                if (twK2 != null) {
                    C19228WQj wQj2 = this.A06;
                    if (wQj2 != null) {
                        twK2.A04.add(wQj2);
                        C14436TwK twK3 = this.A05;
                        if (twK3 != null) {
                            C19228WQj wQj3 = this.A06;
                            if (wQj3 != null) {
                                twK3.A07.add(wQj3);
                                C14436TwK twK4 = this.A05;
                                if (twK4 != null) {
                                    C19228WQj wQj4 = this.A06;
                                    if (wQj4 != null) {
                                        twK4.A05.add(wQj4);
                                        C14436TwK twK5 = this.A05;
                                        if (twK5 != null) {
                                            C19228WQj wQj5 = this.A06;
                                            if (wQj5 != null) {
                                                twK5.A03.add(wQj5);
                                                1Ng A0R = DbX.A0R(this.A0C);
                                                Class<WQG> cls = WQG.class;
                                                C19228WQj wQj6 = this.A06;
                                                if (wQj6 != null) {
                                                    A0R.A01(wQj6, cls);
                                                    AnonymousClass0fD.A09(-918332858, A022);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F("recentsUpdatedListener");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("hideSearchEntryController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStop() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1744349652);
        C15398Uc1.super.onStop();
        C59830Ja5 ja5 = this.A04;
        if (ja5 == null) {
            str = "trackPreviewController";
        } else {
            C13988Tno.A1K(ja5);
            C14436TwK twK = this.A05;
            if (twK != null) {
                C19228WQj wQj = this.A06;
                str = "recentsUpdatedListener";
                if (wQj != null) {
                    twK.A08.remove(wQj);
                    C14436TwK twK2 = this.A05;
                    if (twK2 != null) {
                        C19228WQj wQj2 = this.A06;
                        if (wQj2 != null) {
                            twK2.A04.remove(wQj2);
                            C14436TwK twK3 = this.A05;
                            if (twK3 != null) {
                                C19228WQj wQj3 = this.A06;
                                if (wQj3 != null) {
                                    twK3.A07.remove(wQj3);
                                    C14436TwK twK4 = this.A05;
                                    if (twK4 != null) {
                                        C19228WQj wQj4 = this.A06;
                                        if (wQj4 != null) {
                                            twK4.A05.remove(wQj4);
                                            C14436TwK twK5 = this.A05;
                                            if (twK5 != null) {
                                                C19228WQj wQj5 = this.A06;
                                                if (wQj5 != null) {
                                                    twK5.A03.remove(wQj5);
                                                    1Ng A0R = DbX.A0R(this.A0C);
                                                    Class<WQG> cls = WQG.class;
                                                    C19228WQj wQj6 = this.A06;
                                                    if (wQj6 != null) {
                                                        A0R.A02(wQj6, cls);
                                                        AnonymousClass0fD.A09(-626385478, A022);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F("hideSearchEntryController");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
