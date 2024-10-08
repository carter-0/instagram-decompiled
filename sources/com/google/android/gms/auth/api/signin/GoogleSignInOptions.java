package com.google.android.gms.auth.api.signin;

import X.AnonymousClass63L;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C11255SHp;
import X.C301145yd;
import X.Dba;
import X.Pxi;
import X.SWX;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements AnonymousClass63L, ReflectedParcelable {
    public static final GoogleSignInOptions A0B;
    public static final GoogleSignInOptions A0C;
    public static final Scope A0D = new Scope(1, "profile");
    public static final Scope A0E = new Scope(1, "email");
    public static final Scope A0F = new Scope(1, "openid");
    public static final Scope A0G;
    public static final Scope A0H = new Scope(1, "https://www.googleapis.com/auth/games");
    public static final Comparator A0I = new Object();
    public static final Parcelable.Creator CREATOR = SWX.A00(11);
    public Account A00;
    public String A01;
    public String A02;
    public String A03;
    public ArrayList A04;
    public boolean A05;
    public Map A06;
    public final int A07;
    public final ArrayList A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r6.A00 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (android.text.TextUtils.isEmpty(r6.A01) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 != 0) goto L_0x0004
            return r4
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r6 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r6     // Catch:{ ClassCastException -> 0x007c }
            java.util.ArrayList r0 = r5.A04     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ ClassCastException -> 0x007c }
            if (r0 == 0) goto L_0x007c
            java.util.ArrayList r0 = r6.A04     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ ClassCastException -> 0x007c }
            if (r0 == 0) goto L_0x007c
            java.util.ArrayList r3 = r5.A08     // Catch:{ ClassCastException -> 0x007c }
            int r2 = r3.size()     // Catch:{ ClassCastException -> 0x007c }
            java.util.ArrayList r1 = r6.A08     // Catch:{ ClassCastException -> 0x007c }
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r1)     // Catch:{ ClassCastException -> 0x007c }
            int r0 = r0.size()     // Catch:{ ClassCastException -> 0x007c }
            if (r2 != r0) goto L_0x007c
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r1)     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = r3.containsAll(r0)     // Catch:{ ClassCastException -> 0x007c }
            if (r0 == 0) goto L_0x007c
            android.accounts.Account r1 = r5.A00     // Catch:{ ClassCastException -> 0x007c }
            if (r1 != 0) goto L_0x0058
            android.accounts.Account r0 = r6.A00     // Catch:{ ClassCastException -> 0x007c }
            if (r0 != 0) goto L_0x007c
        L_0x003a:
            java.lang.String r1 = r5.A01     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x007c }
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r6.A01     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ ClassCastException -> 0x007c }
            if (r0 == 0) goto L_0x007c
        L_0x004a:
            boolean r1 = r5.A0A     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = r6.A0A     // Catch:{ ClassCastException -> 0x007c }
            goto L_0x0061
        L_0x004f:
            java.lang.String r0 = r6.A01     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = r1.equals(r0)     // Catch:{ ClassCastException -> 0x007c }
            if (r0 != 0) goto L_0x004a
            goto L_0x007b
        L_0x0058:
            android.accounts.Account r0 = r6.A00     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = r1.equals(r0)     // Catch:{ ClassCastException -> 0x007c }
            if (r0 == 0) goto L_0x007c
            goto L_0x003a
        L_0x0061:
            if (r1 != r0) goto L_0x007c
            boolean r1 = r5.A05     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = r6.A05     // Catch:{ ClassCastException -> 0x007c }
            if (r1 != r0) goto L_0x007c
            boolean r1 = r5.A09     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = r6.A09     // Catch:{ ClassCastException -> 0x007c }
            if (r1 != r0) goto L_0x007c
            java.lang.String r1 = r5.A03     // Catch:{ ClassCastException -> 0x007c }
            java.lang.String r0 = r6.A03     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch:{ ClassCastException -> 0x007c }
            if (r0 == 0) goto L_0x007c
            r0 = 1
            return r0
        L_0x007b:
            return r4
        L_0x007c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A062 = Pxi.A06(parcel, this.A07);
        C301145yd.A0E(parcel, AnonymousClass7TE.A1D(this.A08), 2, false);
        C301145yd.A0A(parcel, this.A00, 3, i, false);
        C301145yd.A09(parcel, 4, this.A05);
        C301145yd.A09(parcel, 5, this.A09);
        C301145yd.A09(parcel, 6, this.A0A);
        C301145yd.A0C(parcel, this.A01, 7, false);
        C301145yd.A0C(parcel, this.A02, 8, false);
        C301145yd.A0E(parcel, this.A04, 9, false);
        C301145yd.A0C(parcel, this.A03, 10, false);
        C301145yd.A06(parcel, A062);
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, java.util.Comparator] */
    static {
        Scope scope = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        A0G = scope;
        C11255SHp sHp = new C11255SHp();
        Set set = sHp.A02;
        set.add(A0F);
        set.add(A0D);
        A0C = sHp.A00();
        C11255SHp sHp2 = new C11255SHp();
        Set set2 = sHp2.A02;
        set2.add(scope);
        set2.addAll(Arrays.asList(new Scope[0]));
        A0B = sHp2.A00();
    }

    public GoogleSignInOptions(Account account, String str, String str2, String str3, ArrayList arrayList, Map map, int i, boolean z, boolean z2, boolean z3) {
        this.A07 = i;
        this.A08 = arrayList;
        this.A00 = account;
        this.A05 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = Dba.A0e(map);
        this.A06 = map;
        this.A03 = str3;
    }

    public final int hashCode() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            A1C.add(((Scope) arrayList.get(i)).A01);
        }
        Collections.sort(A1C);
        return ((((((((((((A1C.hashCode() + 31) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.A03);
    }
}
