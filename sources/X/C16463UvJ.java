package X;

import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;

/* renamed from: X.UvJ  reason: case insensitive filesystem */
public final class C16463UvJ extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelVotingShareFragment";
    public RectF A00;
    public RectF A01;
    public PendingRecipient A02;
    public File A03;
    public final C41837B2s A04 = new WUP(this, 30);

    public final String getModuleName() {
        return C273654mx.A00(931);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2103484699);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = (RectF) requireArguments.getParcelable(AnonymousClass000.A00(121));
        this.A01 = (RectF) requireArguments.getParcelable(AnonymousClass000.A00(122));
        String string = requireArguments.getString(AnonymousClass000.A00(120));
        if (string != null) {
            this.A03 = new File(string);
            this.A02 = (PendingRecipient) requireArguments.getParcelable(AnonymousClass000.A00(119));
            AnonymousClass0fD.A09(-1762615566, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(624399825, A022);
        throw A0y;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(682511445);
        super.onResume();
        File file = this.A03;
        if (file == null || !file.exists()) {
            VJ3.A00(this);
        }
        AnonymousClass0fD.A09(-1132333968, A022);
    }
}
