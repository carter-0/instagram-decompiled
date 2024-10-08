package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import java.util.List;

/* renamed from: X.NOa  reason: case insensitive filesystem */
public final class C68578NOa extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C74398PuE A03;
    public final P3T A04;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate;
        boolean A1U = AnonymousClass7TF.A1U(0, viewGroup, layoutInflater);
        UserSession userSession = this.A02;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36322572784118034L)) {
            inflate = 2Su.A00(layoutInflater, (ViewGroup.LayoutParams) null, viewGroup, R.layout.direct_inbox_row_layout);
        } else {
            inflate = layoutInflater.inflate(R.layout.direct_inbox_row_layout, viewGroup, false);
        }
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        0qQ.A0B(userSession, 0);
        boolean A06 = 182.A06(r2, userSession, 36328431117483354L);
        0qQ.A0B(inflate, A1U ? 1 : 0);
        return new C67283MlI(inflate, (AnonymousClass34Y) null, A06);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r34, C249703kE r35) {
        String str;
        String A012;
        String A09;
        OuA ouA = (OuA) r34;
        C67283MlI mlI = (C67283MlI) r35;
        boolean A1U = AnonymousClass7TF.A1U(0, ouA, mlI);
        Context context = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass0iw r31 = this.A01;
        P3T p3t = this.A04;
        C74398PuE puE = this.A03;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, A1U ? 1 : 0);
        C51973G9u.A0r(2, r31, p3t, puE);
        C74516PwB pwB = ouA.A07;
        C254743sy CBV = pwB.CBV();
        mlI.A06 = CBV;
        ViewGroup viewGroup = mlI.A07;
        viewGroup.setAlpha(ouA.A00);
        viewGroup.setClickable(ouA.A0C);
        String str2 = ouA.A09;
        C254703su r3 = ouA.A06;
        if (r3 != null) {
            str = r3.A0g();
        } else {
            str = null;
        }
        List list = ouA.A0B;
        int i = ouA.A01;
        mlI.getBindingAdapterPosition();
        C67058MhZ mhZ = new C67058MhZ(i, str2, str, list);
        boolean z = ouA.A0D;
        boolean z2 = z;
        if (!z) {
            mlI.A0C.A02();
            P3T p3t2 = p3t;
            AnonymousClass0fU.A00(new C71400Ojz(10, (Object) mhZ, (Object) CBV, (Object) pwB, (Object) p3t2), viewGroup);
            viewGroup.setOnLongClickListener(new C71423OkO(mhZ, mlI, pwB, ouA, p3t2, CBV));
        } else {
            viewGroup.setOnLongClickListener((View.OnLongClickListener) null);
            C71662eb r20 = mlI.A0C;
            C66754Mbz A002 = C66701Mb8.A00(ouA.A03, pwB);
            boolean CVr = pwB.CVr();
            pwB.isPending();
            boolean z3 = pwB.CBV() instanceof MsysThreadId;
            boolean z4 = true;
            if (!2Ek.A02(AnonymousClass7TF.A0Q(userSession))) {
                if (!z3 || 182.A06(0Tu.A05, userSession, 36313166804223795L)) {
                    if (CVr) {
                        z4 = DbY.A1Z(0Tu.A06, userSession, 2342153624806883520L);
                    }
                }
                C69993NvX.A00(viewGroup, r20, puE, A002, z4);
            }
            z4 = false;
            C69993NvX.A00(viewGroup, r20, puE, A002, z4);
        }
        IgTextView igTextView = mlI.A0A;
        int A042 = C51968G9o.A04(JTP.A0C(igTextView, 0));
        igTextView.setTypeface((Typeface) null);
        igTextView.setTextColor(A042);
        C66776McM mcM = ouA.A03;
        List BkC = pwB.BkC();
        C67059Mha mha = mlI.A0O;
        C71662eb r13 = mlI.A0H;
        C67061Mhc.A00(r31, r13, mhZ, p3t, mha, mcM, mlI.A05, BkC, z2, false);
        C67064Mhf.A01(mlI.A09, mlI.A08, userSession, ouA.A04);
        C67075Mhq.A01(userSession, mlI.A0K, pwB.AxI());
        String str3 = ouA.A0A;
        if (str3 == null || str3.length() == 0) {
            r13.A02();
        } else {
            r13.A03(0);
            ((TextView) r13.A01()).setText(str3);
        }
        C67073Mho.A00(context, mlI.A01, igTextView, userSession, mlI.A0F, mlI.A03, mlI.A04, ouA.A05);
        C46488Dfr.A00(mlI.A0L, mlI.A0R, ouA.A08);
        mlI.A0E.A02();
        if ((CBV instanceof DirectThreadKey) || (CBV instanceof DirectMsysMixedThreadKey)) {
            A012 = C66647MaG.A03(CBV).A01();
            0qQ.A07(A012);
        } else {
            A012 = String.valueOf(C66647MaG.A00(CBV));
        }
        if (r3 != null) {
            r3.A0g();
        }
        mlI.getBindingAdapterPosition();
        0qQ.A0B(A012, A1U);
        int i2 = mhZ.A00;
        C71153OeR oeR = p3t.A00;
        if ((pwB.CBV() instanceof DirectThreadKey) && (A09 = C66647MaG.A09(pwB.CBV())) != null && oeR.A16.add(A09)) {
            OTI oti = oeR.A0m;
            String obj = oeR.A02.A01.toString();
            0qQ.A0B(obj, 2);
            UserSession userSession2 = oti.A01;
            List Bk9 = pwB.Bk9();
            boolean CcG = pwB.CcG();
            boolean Cdt = pwB.Cdt();
            0Aj A0e = AnonymousClass7TE.A0e(C51967G9n.A0Z(oti.A00, userSession2, Bk9, A1U), "direct_candidates_impression");
            if (AnonymousClass7TE.A1b(Bk9)) {
                A0e.A9O("recipient_ids", Bk9);
                if (Bk9.size() == A1U) {
                    A0e.A9F("a_pk", C51971G9r.A0n(0, AnonymousClass7TE.A19(Bk9, 0)));
                }
                A0e.A9F("position", DbV.A0p(A0e, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A09, i2));
                A0e.A7p("is_spam", JTP.A0g(A0e, "selected_filter", obj, CcG));
                A0e.A7p("is_unread", Boolean.valueOf(Cdt));
                A0e.Cgf();
            }
            if (C66640Ma9.A02(pwB) && 1YZ.A02 != null) {
                0wc r32 = oeR.A0e;
                String B4l = pwB.B4l();
                List Bk92 = pwB.Bk9();
                AnonymousClass7TF.A1C(r32, 0, Bk92);
                AnonymousClass73V.A06(r32, (C3263576k) null, (C69445Nlp) null, "impression", "restricted_account_thread", B4l, Bk92);
            }
        }
    }

    public final Class modelClass() {
        return OuA.class;
    }

    public C68578NOa(Context context, AnonymousClass0iw r2, UserSession userSession, C74398PuE puE, P3T p3t) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
        this.A04 = p3t;
        this.A03 = puE;
    }
}
