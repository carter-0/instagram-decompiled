package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;

/* renamed from: X.Ua9  reason: case insensitive filesystem */
public final class C15302Ua9 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenFormListFragmentV2";
    public RecyclerView A00;
    public C262204Co A01;
    public final AnonymousClass0eM A02;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        C13992Tns.A0r(r3, 2131970397);
        W0D.A01(W0D.A00(this, r3), this, 40);
    }

    public final String getModuleName() {
        return "lead_gen_form_list_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass3AR r1;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r4 = this.A02;
        C14779U8p u8p = (C14779U8p) r4.getValue();
        C17777Vfo vfo = u8p.A08;
        String str = u8p.A0B;
        0qQ.A0B(str, 0);
        XB6.A02(vfo.A00, str, "lead_gen_form_list", "form_list_impression");
        RecyclerView A0K = DbX.A0K(view);
        this.A00 = A0K;
        AnonymousClass3AS r12 = null;
        if (A0K != null) {
            r12 = A0K.A0C;
        }
        if ((r12 instanceof AnonymousClass3AR) && (r1 = (AnonymousClass3AR) r12) != null) {
            r1.A00 = false;
        }
        if (A0K != null) {
            A0K.setAdapter(new C14797U9r(new WBA((Object) this, 41), (C14779U8p) r4.getValue()));
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            UB1.A00(recyclerView, this, 11);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return ((C14779U8p) this.A02.getValue()).A07;
    }

    public final boolean onBackPressed() {
        AnonymousClass0eM r4 = this.A02;
        if (((C14779U8p) r4.getValue()).A04) {
            C14779U8p u8p = (C14779U8p) r4.getValue();
            C17777Vfo vfo = u8p.A08;
            String str = u8p.A0B;
            0qQ.A0B(str, 0);
            XB6.A01(vfo.A00, str, "lead_gen_form_list", "cancel");
        }
        ((C14779U8p) r4.getValue()).A04 = true;
        return false;
    }

    public C15302Ua9() {
        C20700WxW wxW = new C20700WxW(this, 18);
        AnonymousClass0eM A002 = C20700WxW.A00(new C20700WxW(this, 15), 0eO.A02, 16);
        this.A02 = new C227862kA(new C20700WxW(A002, 17), wxW, new C20612Wvt(21, (Object) null, A002), new 0Yh(C14779U8p.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(959561629);
        C15302Ua9.super.onCreate(bundle);
        C14779U8p u8p = (C14779U8p) this.A02.getValue();
        u8p.A0D.clear();
        LeadGenBaseFormList leadGenBaseFormList = u8p.A09;
        u8p.A02 = leadGenBaseFormList.A02;
        u8p.A03 = leadGenBaseFormList.A05;
        u8p.A01 = leadGenBaseFormList.A01;
        C14779U8p.A00(u8p, leadGenBaseFormList.A04);
        AnonymousClass0fD.A09(-1724086998, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(338664860);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_form_list_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-180254402, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-958155909);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(-2037145146, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, androidx.fragment.app.Fragment, X.Ua9] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(667204728);
        C15302Ua9.super.onStart();
        this.A01 = C20592WvV.A00(this, ((C14779U8p) this.A02.getValue()).A0F, 33);
        AnonymousClass0fD.A09(1331647852, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(78624570);
        C15302Ua9.super.onStop();
        this.A01 = JTQ.A0n(this.A01);
        AnonymousClass0fD.A09(1380823852, A022);
    }
}
