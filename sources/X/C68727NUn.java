package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NUn  reason: case insensitive filesystem */
public final class C68727NUn extends NJT {
    public static final /* synthetic */ AnonymousClass0YZ[] A05;
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeDisplayCodeFragment";
    public C62320sa A00 = new C73908Plj(this, 25);
    public final C319956rV A01 = NJT.A01(this, 18);
    public final C319956rV A02;
    public final C319956rV A03;
    public final AnonymousClass0eM A04;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        super.configureActionBar(r3);
        r3.ART(true);
        r3.setIsLoading(false);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.NUn, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C71407Ok6.A02((C3021461u) C66940MfZ.A01(this.A02, this, A05, 1), this, 18);
        AnonymousClass0eM r3 = this.A04;
        Dba.A15(this, ((C67742Mtv) r3.getValue()).A01, new C74193PqZ(this, 36), 25);
        ((C67742Mtv) r3.getValue()).A00();
        Integer A022 = C71145Oe2.A02(this);
        0qQ.A0B(A022, 0);
        NUH nuh = ((C67742Mtv) r3.getValue()).A03;
        nuh.A0B("OTC_DISPLAY_CODE_IMPRESSION");
        nuh.A0D("ENTRY_POINT", C69894Ntw.A00(A022));
        DbZ.A1C(this, new MG9(this, (AnonymousClass4D7) null, 28), ((C67742Mtv) r3.getValue()).A05);
    }

    static {
        Class<C68727NUn> cls = C68727NUn.class;
        A05 = new AnonymousClass0YZ[]{C66580MXl.A16(cls, "actionBar", "getActionBar()Lcom/instagram/actionbar/ActionBarService;"), C66580MXl.A16(cls, "bottomButtons", "getBottomButtons()Lcom/instagram/igds/components/bottombutton/IgdsBottomButtonLayout;"), C66580MXl.A16(cls, "codeText", "getCodeText()Landroid/widget/TextView;")};
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, java.lang.Object, X.NUn] */
    public C68727NUn() {
        C73908Plj plj = new C73908Plj(this, 24);
        AnonymousClass0eM A002 = C73908Plj.A00(new C73908Plj(this, 21), 0eO.A02, 22);
        this.A04 = DbS.A0I(new C73908Plj(A002, 23), plj, new C73664Phd(47, A002, (Object) null), DbS.A0z(C67742Mtv.class));
        this.A02 = NJT.A01(this, 19);
        this.A03 = NJT.A01(this, 20);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-251783473);
        0qQ.A0B(layoutInflater, 0);
        C68727NUn.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_display_code_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1813504545, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-408880972);
        super.onDestroy();
        ((C67742Mtv) this.A04.getValue()).A03.A08();
        AnonymousClass0fD.A09(725724661, A022);
    }
}
