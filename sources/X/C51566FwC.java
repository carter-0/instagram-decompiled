package X;

import android.content.Context;
import android.content.pm.ResolveInfo;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalInjectionUnit$$ExternalSyntheticBackport0;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import com.meta.foa.accountswitcher.UserAccountInfo;
import java.text.Collator;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.FwC  reason: case insensitive filesystem */
public final class C51566FwC implements Comparator {
    public final int A00;
    public final Object A01;

    public C51566FwC(0sL r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        long j;
        long j2;
        AnonymousClass3U9 r2;
        switch (this.A00) {
            case 1:
                UserSession userSession = ((DirectShareSheetFragmentViewModel) this.A01).A0L;
                return 29b.A00((Comparable) 1Av.A02(1Au.A00(userSession), "contacts_in_sharesheet_access_map").get(AnonymousClass7TF.A0h(obj2)), (Comparable) 1Av.A02(1Au.A00(userSession), "contacts_in_sharesheet_access_map").get(AnonymousClass7TF.A0h(obj)));
            case 2:
                int compare = ((Comparator) this.A01).compare(obj, obj2);
                if (compare == 0) {
                    return 29b.A00(((C53374Gn4) obj).A03, ((C53374Gn4) obj2).A03);
                }
                return compare;
            case 3:
                DirectThreadKey A03 = C66647MaG.A03(AnonymousClass6W3.A06(DbS.A0c((DirectShareTarget) obj)));
                DirectThreadKey A032 = C66647MaG.A03(AnonymousClass6W3.A06(DbS.A0c((DirectShareTarget) obj2)));
                AnonymousClass3U9 r1 = null;
                if (A03 != null) {
                    r2 = 2Dr.A03((2Dm) ((C46502Dg5) this.A01).A06.get(), A03);
                } else {
                    r2 = null;
                }
                if (A032 != null) {
                    r1 = 2Dr.A03((2Dm) ((C46502Dg5) this.A01).A06.get(), A032);
                }
                if (r2 != null) {
                    if (r1 == null) {
                        return -1;
                    }
                    Comparator comparator = AnonymousClass2Ep.A00;
                    0qQ.A0A(comparator);
                    return comparator.compare(r2, r1);
                } else if (r2 == r1) {
                    return 0;
                } else {
                    return 1;
                }
            case 4:
                DirectShareTarget directShareTarget = (DirectShareTarget) obj;
                DirectShareTarget directShareTarget2 = (DirectShareTarget) obj2;
                int compare2 = ((C46502Dg5) this.A01).A03.compare(directShareTarget, directShareTarget2);
                if (compare2 == 0) {
                    return DbT.A0y(directShareTarget).compareTo(DbT.A0y(directShareTarget2));
                }
                return compare2;
            case 5:
                2Eu r11 = (2Eu) obj;
                2Eu r12 = (2Eu) obj2;
                if (r12.BKd() > r11.BKd()) {
                    return 1;
                }
                if (r12.BKd() < r11.BKd()) {
                    return -1;
                }
                return 0;
            case 6:
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                ResolveInfo resolveInfo2 = (ResolveInfo) obj2;
                boolean z = resolveInfo.isDefault;
                boolean z2 = resolveInfo2.isDefault;
                if (z != z2) {
                    return LocalInjectionUnit$$ExternalSyntheticBackport0.m(z2, z);
                }
                List list = (List) this.A01;
                return list.indexOf(resolveInfo2.resolvePackageName) - list.indexOf(resolveInfo.resolvePackageName);
            case 7:
                Context context = (Context) this.A01;
                C47271Dtz dtz = (C47271Dtz) obj;
                C47271Dtz dtz2 = (C47271Dtz) obj2;
                if (dtz.equals(dtz2)) {
                    return 0;
                }
                Locale locale = dtz.A03;
                Locale locale2 = Locale.US;
                if (locale.equals(locale2)) {
                    return -1;
                }
                if (!dtz2.A03.equals(locale2)) {
                    return context.getString(dtz.A01).compareTo(context.getString(dtz2.A01));
                }
                return 1;
            case 8:
                C46556Dgy dgy = (C46556Dgy) this.A01;
                HashMap hashMap = dgy.A01;
                String str = ((C46558Dh0) obj2).A02;
                Number number = (Number) hashMap.get(str);
                AnonymousClass0eM r6 = dgy.A02;
                Iterator it = ((List) ((05G) r6.getValue()).getValue()).iterator();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    i = -1;
                    if (!it.hasNext()) {
                        i3 = -1;
                    } else if (!0qQ.A0K(((C46558Dh0) it.next()).A02, str)) {
                        i3++;
                    }
                }
                long j3 = (long) i3;
                if (number != null) {
                    j = number.longValue();
                } else {
                    j = -j3;
                }
                Long valueOf = Long.valueOf(j);
                String str2 = ((C46558Dh0) obj).A02;
                Number number2 = (Number) hashMap.get(str2);
                Iterator it2 = ((List) ((05G) r6.getValue()).getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (0qQ.A0K(((C46558Dh0) it2.next()).A02, str2)) {
                            i = i2;
                        } else {
                            i2++;
                        }
                    }
                }
                long j4 = (long) i;
                if (number2 != null) {
                    j2 = number2.longValue();
                } else {
                    j2 = -j4;
                }
                return 29b.A00(valueOf, Long.valueOf(j2));
            case 9:
                0sP r0 = (0sP) this.A01;
                return 29b.A00((Integer) r0.invoke(obj), (Integer) r0.invoke(obj2));
            case 11:
                C319646qx r112 = (C319646qx) obj;
                C319646qx r122 = (C319646qx) obj2;
                boolean A1Z = AnonymousClass7TG.A1Z(r112, r122);
                String str3 = r112.A07;
                String str4 = r122.A07;
                if (str3 == null) {
                    if (str4 == null) {
                        return 0;
                    }
                    return A1Z ? 1 : 0;
                } else if (str4 != null) {
                    return ((Collator) this.A01).compare(str3, str4);
                } else {
                    return -1;
                }
            case 13:
                return ((Collator) this.A01).compare(((User) obj).B8Q(), ((User) obj2).B8Q());
            case 14:
                List list2 = (List) this.A01;
                String str5 = ((UserAccountInfo) obj).A00;
                0qQ.A0B(list2, 0);
                return 29b.A00(Integer.valueOf(list2.indexOf(str5)), Integer.valueOf(list2.indexOf(((UserAccountInfo) obj2).A00)));
            default:
                return AnonymousClass7TE.A0M(((0sL) this.A01).invoke(obj, obj2));
        }
    }

    public C51566FwC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C51566FwC() {
        this.A00 = 11;
        this.A01 = Collator.getInstance(AnonymousClass1Q2.A02());
    }
}
