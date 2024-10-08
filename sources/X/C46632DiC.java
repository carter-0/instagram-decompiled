package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.login.credentialmanager.CredentialManagerFetchHelper;

/* renamed from: X.DiC  reason: case insensitive filesystem */
public abstract class C46632DiC {
    public static C51879G5r A00;
    public static String A01;

    public static final void A00(Fragment fragment, AnonymousClass0aP r10, G85 g85, C46634DiE diE, boolean z) {
        AnonymousClass0aP r8 = r10;
        G85 g852 = g85;
        C46634DiE diE2 = diE;
        if (!C46629Di9.A00(r10) && !C46629Di9.A01(r10)) {
            C290815g0 instanceAsync = 1WP.getInstanceAsync();
            instanceAsync.A00 = new C15826Uj9(0, diE2, g852, r8, fragment, z);
            1ES.A03(instanceAsync);
        } else if (fragment != null && fragment.getContext() != null && !C46629Di9.A00(r10) && C46629Di9.A01(r10)) {
            Context context = fragment.getContext();
            if (context != null) {
                CredentialManagerFetchHelper credentialManagerFetchHelper = new CredentialManagerFetchHelper(context);
                L8K l8k = new L8K(fragment, r10, g85, diE);
                credentialManagerFetchHelper.A00 = l8k;
                AnonymousClass7TE.A1Z(new MH3(credentialManagerFetchHelper, l8k, (AnonymousClass4D7) null, 6), credentialManagerFetchHelper.A01);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A02(Fragment fragment, 0lg r3, ImageUrl imageUrl, G78 g78, C46634DiE diE, String str, String str2, boolean z) {
        DbW.A1O(str2, 2, r3);
        C290815g0 instanceAsync = 1WP.getInstanceAsync();
        instanceAsync.A00 = new EHS(fragment, r3, imageUrl, g78, diE, str, str2, z);
        1ES.A03(instanceAsync);
    }

    public static final void A01(Fragment fragment, 0lg r4) {
        AnonymousClass7TG.A1N(r4, fragment);
        C290815g0 instanceAsync = 1WP.getInstanceAsync();
        instanceAsync.A00 = new EHO(2, fragment, r4);
        1ES.A03(instanceAsync);
    }
}
