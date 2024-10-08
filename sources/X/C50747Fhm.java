package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.Fhm  reason: case insensitive filesystem */
public final class C50747Fhm implements G6H {
    public final Fragment A00;

    public final void CI0(Uri uri, Bundle bundle) {
        C319586qr r0;
        0qQ.A0B(uri, 0);
        C48729EjE.A00();
        Fragment fragment = this.A00;
        Context context = fragment.getContext();
        if (context != null) {
            Intent A04 = DbU.A04(context);
            Bundle requireArguments = fragment.requireArguments();
            String queryParameter = uri.getQueryParameter("from");
            if (queryParameter == null) {
                queryParameter = "megaphone";
            }
            DbS.A1B(requireArguments, queryParameter);
            String queryParameter2 = uri.getQueryParameter("account_type");
            if ("business".equals(queryParameter2)) {
                r0 = C319586qr.CONVERSION_FLOW;
            } else if ("creator".equals(queryParameter2)) {
                r0 = C319586qr.CREATOR_CONVERSION_FLOW;
            } else {
                r0 = C319586qr.INTEREST_ACCOUNT_CONVERSION;
            }
            requireArguments.putInt("business_account_flow", r0.A00);
            requireArguments.putInt("intro_entry_position", 0);
            A04.putExtras(requireArguments);
            0kR.A05(fragment, A04, 11);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C50747Fhm(Fragment fragment) {
        this.A00 = fragment;
    }
}
