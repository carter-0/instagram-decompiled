package X;

import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;

/* renamed from: X.UvL  reason: case insensitive filesystem */
public final class C16465UvL extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelInfoCenterFactShareFragment";
    public RectF A00;
    public RectF A01;
    public InfoCenterFactShareInfoIntf A02;
    public PendingRecipient A03;
    public File A04;
    public final C41837B2s A05 = new WUP(this, 21);

    public final String getModuleName() {
        return C273654mx.A00(919);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(922301527);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = (RectF) requireArguments.getParcelable(AnonymousClass000.A00(121));
        this.A01 = (RectF) requireArguments.getParcelable(AnonymousClass000.A00(122));
        String string = requireArguments.getString(AnonymousClass000.A00(120));
        if (string != null) {
            this.A04 = new File(string);
        }
        this.A02 = (InfoCenterFactShareInfoIntf) requireArguments.getParcelable(AnonymousClass000.A00(2447));
        this.A03 = (PendingRecipient) requireArguments.getParcelable(AnonymousClass000.A00(119));
        AnonymousClass0fD.A09(1419237486, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1847166393);
        super.onResume();
        File file = this.A04;
        if (file == null || !file.exists() || this.A02 == null) {
            VJ3.A00(this);
        }
        AnonymousClass0fD.A09(-2133543872, A022);
    }
}
