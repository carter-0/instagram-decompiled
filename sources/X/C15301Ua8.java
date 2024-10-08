package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;

/* renamed from: X.Ua8  reason: case insensitive filesystem */
public final class C15301Ua8 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenFormListFragment";
    public RecyclerView A00;
    public C262204Co A01;
    public final AnonymousClass0eM A02;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        C13992Tns.A0r(r3, 2131970397);
        W0D.A01(W0D.A00(this, r3), this, 7);
    }

    public final String getModuleName() {
        return "lead_gen_form_list_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass3AR r1;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r4 = this.A02;
        C14778U8o u8o = (C14778U8o) r4.getValue();
        C17777Vfo vfo = u8o.A09;
        String str = u8o.A0C;
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
            A0K.setAdapter(new C14796U9q(new WBA((Object) this, 8), (C14778U8o) r4.getValue()));
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            UB1.A00(recyclerView, this, 10);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return ((C14778U8o) this.A02.getValue()).A08;
    }

    public final boolean onBackPressed() {
        AnonymousClass0eM r4 = this.A02;
        if (((C14778U8o) r4.getValue()).A05) {
            C14778U8o u8o = (C14778U8o) r4.getValue();
            C17777Vfo vfo = u8o.A09;
            String str = u8o.A0C;
            0qQ.A0B(str, 0);
            XB6.A01(vfo.A00, str, "lead_gen_form_list", "cancel");
        }
        ((C14778U8o) r4.getValue()).A05 = true;
        return false;
    }

    public C15301Ua8() {
        C20700WxW wxW = new C20700WxW(this, 14);
        AnonymousClass0eM A002 = C20700WxW.A00(new C20700WxW(this, 11), 0eO.A02, 12);
        this.A02 = new C227862kA(new C20700WxW(A002, 13), wxW, new C20612Wvt(20, (Object) null, A002), new 0Yh(C14778U8o.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1430584028);
        C15301Ua8.super.onCreate(bundle);
        C14778U8o u8o = (C14778U8o) this.A02.getValue();
        u8o.A0D.clear();
        LeadGenBaseFormList leadGenBaseFormList = u8o.A0A;
        u8o.A03 = leadGenBaseFormList.A02;
        u8o.A04 = leadGenBaseFormList.A05;
        u8o.A01 = leadGenBaseFormList.A01;
        C14778U8o.A00(u8o, leadGenBaseFormList.A04);
        AnonymousClass0fD.A09(628907815, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1299176991);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_form_list_fragment, viewGroup, false);
        AnonymousClass0fD.A09(776899337, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1033962085);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(-1224200744, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.Ua8, androidx.fragment.app.Fragment] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-293177872);
        C15301Ua8.super.onStart();
        this.A01 = C20592WvV.A00(this, ((C14778U8o) this.A02.getValue()).A0F, 19);
        AnonymousClass0fD.A09(1361929250, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1785751311);
        C15301Ua8.super.onStop();
        this.A01 = JTQ.A0n(this.A01);
        AnonymousClass0fD.A09(-213575708, A022);
    }
}
