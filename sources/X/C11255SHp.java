package X;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.SHp  reason: case insensitive filesystem */
public final class C11255SHp {
    public Account A00;
    public String A01;
    public Set A02 = AnonymousClass7TE.A1F();
    public String A03;
    public String A04;
    public Map A05 = AnonymousClass7TE.A1E();
    public boolean A06;
    public boolean A07;
    public boolean A08;

    public final GoogleSignInOptions A00() {
        Set set = this.A02;
        if (set.contains(GoogleSignInOptions.A0H)) {
            Scope scope = GoogleSignInOptions.A0G;
            if (set.contains(scope)) {
                set.remove(scope);
            }
        }
        boolean z = this.A08;
        if (z && (this.A00 == null || !set.isEmpty())) {
            set.add(GoogleSignInOptions.A0F);
        }
        ArrayList A1D = AnonymousClass7TE.A1D(set);
        Account account = this.A00;
        boolean z2 = this.A06;
        boolean z3 = this.A07;
        return new GoogleSignInOptions(account, this.A03, this.A04, this.A01, A1D, this.A05, 3, z, z2, z3);
    }

    public C11255SHp(GoogleSignInOptions googleSignInOptions) {
        AnonymousClass3Qk.A02(googleSignInOptions);
        Parcelable.Creator creator = GoogleSignInOptions.CREATOR;
        this.A02 = C66580MXl.A12(googleSignInOptions.A08);
        this.A06 = googleSignInOptions.A09;
        this.A07 = googleSignInOptions.A0A;
        this.A08 = googleSignInOptions.A05;
        this.A03 = googleSignInOptions.A01;
        this.A00 = googleSignInOptions.A00;
        this.A04 = googleSignInOptions.A02;
        ArrayList arrayList = googleSignInOptions.A04;
        HashMap A1E = AnonymousClass7TE.A1E();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                Pxh.A1I(googleSignInOptionsExtensionParcelable, A1E, googleSignInOptionsExtensionParcelable.A00);
            }
        }
        this.A05 = A1E;
        this.A01 = googleSignInOptions.A03;
    }

    public C11255SHp() {
    }
}
