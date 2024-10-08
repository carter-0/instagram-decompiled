package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.msc.logging.LoggingData;
import com.facebookpay.msc.view.MSCPivotBar;
import com.instagram.android.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class QCP extends Fragment implements C13610Tdc, C13604TdW {
    public View A00;
    public FrameLayout A01;
    public QEY A02;
    public MSCPivotBar A03;
    public List A04;
    public final AnonymousClass2gB A05 = Pxh.A0M();
    public final AnonymousClass2gO A06 = C11647Sdp.A00(this, 9);
    public final AnonymousClass2gO A07 = C11647Sdp.A00(this, 12);
    public final HashMap A08 = AnonymousClass7TE.A1E();
    public final AnonymousClass0eM A09;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, X.QCP, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        Pxf.A1B(AnonymousClass7TE.A0b(view, R.id.content_container), C11426STk.A03().A00(requireContext(), 19));
        this.A01 = (FrameLayout) view.findViewById(R.id.tab_fragment);
        this.A00 = view.findViewById(R.id.progress_bar_container);
        this.A03 = (MSCPivotBar) view.findViewById(R.id.pivot_bar);
        AnonymousClass0eM r3 = this.A09;
        QEY qey = new QEY(new TTH(r3.getValue(), 4), new S61[0]);
        this.A02 = qey;
        MSCPivotBar mSCPivotBar = this.A03;
        if (mSCPivotBar == null) {
            0qQ.A0F("pivotBar");
            throw AnonymousClass00P.createAndThrow();
        }
        mSCPivotBar.setAdapter(qey);
        Drawable indeterminateDrawable = ((ProgressBar) view.findViewById(R.id.progress_bar)).getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setColorFilter(C9162RRn.A00(AnonymousClass05K.A05, C11426STk.A03().A00(requireContext(), 20)));
        }
        Dba.A16(getViewLifecycleOwner(), ((QDD) r3.getValue()).A06, TY1.A00(this, 41), 18);
        ((QDD) r3.getValue()).A08.A06(getViewLifecycleOwner(), this.A06);
        C11651Sdt.A01(getViewLifecycleOwner(), ((QDD) r3.getValue()).A0C, C11647Sdp.A00(this, 10), 20);
        C11651Sdt.A01(this, ((QDD) r3.getValue()).A0B, C11647Sdp.A00(this, 11), 20);
        Dba.A16(this, ((QDD) r3.getValue()).A07, TY1.A00(this, 42), 18);
        this.A05.A0E(((QDD) r3.getValue()).A0A, this.A07);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass2gB C7p() {
        return this.A05;
    }

    public QCP() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C13351TVy(new C13351TVy(this, 22), 23));
        0Yh A0z = DbS.A0z(QDD.class);
        this.A09 = new C227862kA(new C13351TVy(A002, 24), new C13349TVw(40, A002, this), new C13349TVw(39, (Object) null, A002), A0z);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000f: MOVE  (r1v3 X.Tdc) = (r1v1 X.Tdc)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final boolean onBackPressed() {
        /*
            r3 = this;
            X.0hq r1 = r3.getChildFragmentManager()
            r0 = 2131442406(0x7f0b3ae6, float:1.850685E38)
            androidx.fragment.app.Fragment r1 = r1.A0P(r0)
            boolean r0 = r1 instanceof X.C13610Tdc
            if (r0 == 0) goto L_0x0016
            X.Tdc r1 = (X.C13610Tdc) r1
            if (r1 == 0) goto L_0x0016
            r1.onBackPressed()
        L_0x0016:
            X.0eM r0 = r3.A09
            r0.getValue()
            r2 = 667756867(0x27cd2943, float:5.6943666E-15)
            r1 = 615(0x267, float:8.62E-43)
            X.AnonymousClass2E0.A02()
            r0 = 0
            X.SQ2.A02(r2, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QCP.onBackPressed():boolean");
    }

    public final void onCreate(Bundle bundle) {
        LoggingData loggingData;
        int A022 = AnonymousClass0fD.A02(-1067589751);
        QCP.super.onCreate(bundle);
        QDD qdd = (QDD) this.A09.getValue();
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null) {
            str = bundle2.getString("page_id");
        }
        qdd.A02 = str;
        if (bundle2 == null || (loggingData = (LoggingData) bundle2.getParcelable("logging_data")) == null) {
            throw AnonymousClass7TE.A0y();
        }
        qdd.A00 = loggingData;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        AnonymousClass2E0.A02();
        SQ2.A00(667756867, 0, "fetch_init", A1H);
        2FO A002 = C11426STk.A00();
        LoggingData loggingData2 = qdd.A00;
        if (loggingData2 != null) {
            HashMap A003 = C9634ReE.A00(loggingData2);
            A003.put("view_name", "overview");
            A003.put("endpoint", "BSC_PAYOUT_HUB_FETCH_FINANCIAL_ENTITIES");
            A002.Cgl("client_fetch_payouthub_init", A003);
            Object value = qdd.A0F.getValue();
            String str2 = qdd.A02;
            LoggingData loggingData3 = qdd.A00;
            if (loggingData3 != null) {
                String str3 = loggingData3.A00;
                SQB.A01((AnonymousClass07Z) null, C8282QnO.A00(new C11547Sc8(value, str2, str3, 2), AnonymousClass2E0.A06()), qdd.A0D);
                AnonymousClass0fD.A09(1869837826, A022);
                return;
            }
        }
        0qQ.A0F("loggingData");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1683350388);
        0qQ.A0B(layoutInflater, 0);
        FragmentActivity activity = getActivity();
        C11426STk.A05();
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(activity, R.style.BSCIGTheme)).inflate(R.layout.fragment_payout_activity, viewGroup, false);
        AnonymousClass0fD.A09(388329241, A022);
        return inflate;
    }
}
