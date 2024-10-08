package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NLu  reason: case insensitive filesystem */
public final class C68523NLu extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C292975jp A01;
    public final /* synthetic */ C229982oj A02;
    public final /* synthetic */ User A03;

    public C68523NLu(C292975jp r1, C229982oj r2, User user, int i) {
        this.A02 = r2;
        this.A03 = user;
        this.A01 = r1;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object, X.3UI] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        AnonymousClass3UO r10;
        String str;
        String str2;
        List list;
        AnonymousClass3UI A022;
        AnonymousClass3UL A002;
        AnonymousClass3UI A023;
        List list2;
        AnonymousClass3UO r11;
        String str3;
        String str4;
        AnonymousClass3UI A024;
        AnonymousClass3UL A003;
        AnonymousClass3UI A025;
        int A032 = AnonymousClass0fD.A03(-1533703717);
        C334247ax r15 = (C334247ax) obj;
        int A033 = AnonymousClass0fD.A03(-1415259674);
        0qQ.A0B(r15, 0);
        C68523NLu.super.onSuccess(r15);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = C52433GSl.A00(this.A02.A03, r15.getItems()).iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            AnonymousClass3UL r4 = new AnonymousClass3UL((AnonymousClass3UJ) null);
            0qQ.A0B(A0k, 0);
            r4.A03 = A0k;
            User user = this.A03;
            r4.A06 = user.getId();
            r4.A05 = user.B8Q();
            r4.A00 = user.Bh3();
            ? obj2 = new Object();
            obj2.A08 = r4.A0F;
            obj2.A01();
            A1C.add(obj2);
        }
        C292975jp r42 = this.A01;
        int i2 = this.A00;
        if (DbT.A1b(A1C)) {
            AnonymousClass3UH r8 = r42.A03;
            if (r8 != null) {
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                Iterator it2 = A1C.iterator();
                while (it2.hasNext()) {
                    AnonymousClass3UI r102 = (AnonymousClass3UI) it2.next();
                    int i3 = i2 + 1;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            A1C2.add(r102);
                            break;
                        }
                        AnonymousClass3UH r0 = r42.A03;
                        if (r0 == null || (A025 = r0.A02(i4)) == null) {
                            r11 = null;
                        } else {
                            r11 = A025.A07;
                        }
                        if (r11 == AnonymousClass3UO.SUGGESTED_USER) {
                            AnonymousClass3UL A004 = r102.A00();
                            if (A004 != null) {
                                str3 = A004.getId();
                            } else {
                                str3 = null;
                            }
                            AnonymousClass3UH r02 = r42.A03;
                            if (r02 == null || (A024 = r02.A02(i4)) == null || (A003 = A024.A00()) == null) {
                                str4 = null;
                            } else {
                                str4 = A003.getId();
                            }
                            if (0qQ.A0K(str3, str4)) {
                                break;
                            }
                        }
                        i4++;
                    }
                }
                Iterator it3 = A1C2.iterator();
                while (it3.hasNext()) {
                    AnonymousClass3UI r9 = (AnonymousClass3UI) it3.next();
                    int i5 = i2 + 1;
                    while (true) {
                        AnonymousClass3UH r03 = r42.A03;
                        if (r03 == null || (list2 = r03.A0P) == null) {
                            i = 0;
                        } else {
                            i = list2.size();
                        }
                        if (i5 < i) {
                            AnonymousClass3UH r04 = r42.A03;
                            if (r04 == null || (A023 = r04.A02(i5)) == null) {
                                r10 = null;
                            } else {
                                r10 = A023.A07;
                            }
                            if (r10 == AnonymousClass3UO.SUGGESTED_USER) {
                                AnonymousClass3UL A005 = r9.A00();
                                if (A005 != null) {
                                    str = A005.getId();
                                } else {
                                    str = null;
                                }
                                AnonymousClass3UH r05 = r42.A03;
                                if (r05 == null || (A022 = r05.A02(i5)) == null || (A002 = A022.A00()) == null) {
                                    str2 = null;
                                } else {
                                    str2 = A002.getId();
                                }
                                if (0qQ.A0K(str, str2)) {
                                    AnonymousClass3UH r06 = r42.A03;
                                    if (!(r06 == null || (list = r06.A0P) == null)) {
                                        list.remove(i5);
                                    }
                                    i5--;
                                }
                            }
                            i5++;
                        }
                    }
                }
                int i6 = i2 + 1;
                List list3 = r8.A0P;
                if (list3 != null) {
                    list3.addAll(i6, A1C2);
                }
            }
            r42.notifyItemRangeInserted(i2 + 1, A1C.size());
        } else {
            r42.A0I.run();
        }
        AnonymousClass0fD.A0A(-1294365434, A033);
        AnonymousClass0fD.A0A(1955479476, A032);
    }
}
