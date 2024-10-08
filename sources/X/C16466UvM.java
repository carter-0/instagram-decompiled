package X;

import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;

/* renamed from: X.UvM  reason: case insensitive filesystem */
public final class C16466UvM extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelInfoCenterShareFragment";
    public RectF A00;
    public RectF A01;
    public InfoCenterShareInfoIntf A02;
    public PendingRecipient A03;
    public File A04;
    public final C41837B2s A05 = new WUP(this, 22);

    public final String getModuleName() {
        return C273654mx.A00(920);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(44518247);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = (RectF) requireArguments.getParcelable(AnonymousClass000.A00(121));
        this.A01 = (RectF) requireArguments.getParcelable(AnonymousClass000.A00(122));
        this.A04 = new File(JTP.A0m(requireArguments, AnonymousClass000.A00(120)));
        this.A02 = (InfoCenterShareInfoIntf) requireArguments.getParcelable(AnonymousClass000.A00(2448));
        this.A03 = (PendingRecipient) requireArguments.getParcelable(AnonymousClass000.A00(119));
        AnonymousClass0fD.A09(-137575550, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1566145195);
        super.onResume();
        File file = this.A04;
        if (file == null || !file.exists()) {
            VJ3.A00(this);
        }
        AnonymousClass0fD.A09(608322278, A022);
    }
}
