package X;

import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import java.util.Map;

public final class JWc extends MYR {
    public static final String __redex_internal_original_name = "FolderPickerFragment";
    public 0sL A00;
    public final AnonymousClass2Fj A01 = JTO.A0K();
    public final Map A02 = AnonymousClass7TE.A1H();
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final C59744JWd A04 = new C59744JWd(this);

    public final String getModuleName() {
        return "gallery_folder_picker_bottomsheet_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A0B(JTS.A0q(this.A01));
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new C58727Iwa(this, 38));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new KFU(requireContext(), this.A04));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.JWc] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1795069118);
        JWc.super.onCreate(bundle);
        Dba.A16(this, this.A01, new C58727Iwa(this, 39), 57);
        AnonymousClass0fD.A09(-464491545, A022);
    }
}
