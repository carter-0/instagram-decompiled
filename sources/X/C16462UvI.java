package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;
import java.io.IOException;

/* renamed from: X.UvI  reason: case insensitive filesystem */
public final class C16462UvI extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelStandaloneFundraiserShareFragment";
    public 28D A00;
    public C41837B2s A01;
    public PendingRecipient A02;
    public C3499082j A03;
    public File A04;

    public final String getModuleName() {
        return C273654mx.A00(927);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-342991748);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = new WUP(this, 25);
        this.A04 = new File(requireArguments.getString(AnonymousClass000.A00(2433)));
        this.A02 = (PendingRecipient) requireArguments.getParcelable(AnonymousClass000.A00(2435));
        this.A00 = AnonymousClass7TH.A07(requireArguments, AnonymousClass000.A00(118));
        try {
            0c5 r2 = 0c9.A04;
            UserSession userSession = this.A00;
            0qQ.A07(userSession);
            String string = requireArguments.getString(AnonymousClass000.A00(2434));
            if (string == null) {
                string = "";
            }
            this.A03 = C49231Era.parseFromJson(r2.A01(userSession, string));
            AnonymousClass0fD.A09(-1483272998, A022);
        } catch (IOException unused) {
            0wb.A03(__redex_internal_original_name, "Could not parse json Model for the standalone fundraiser sticker.");
            AnonymousClass0fD.A09(1939095067, A022);
        }
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1049775351);
        super.onResume();
        File file = this.A04;
        if (this.A03 == null || file == null || !file.exists()) {
            VJ3.A00(this);
        }
        AnonymousClass0fD.A09(592341971, A022);
    }
}
