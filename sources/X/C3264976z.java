package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.76z  reason: invalid class name and case insensitive filesystem */
public final class C3264976z implements C3264476u {
    public static final C3264976z A00 = new Object();

    public final C328667Fr AM8(Context context, UserSession userSession, AnonymousClass7FE r68, AnonymousClass9HC r69, AnonymousClass7LQ r70) {
        boolean z;
        C3259574v r20;
        String A02;
        ArrayList arrayList;
        boolean z2;
        0sn r0;
        AnonymousClass77A r22;
        String str;
        AnonymousClass9J6 r5;
        AnonymousClass9JN r1;
        0sn r02;
        0sn r8;
        String A022;
        String str2;
        BBV bbv;
        String str3;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        AnonymousClass7FE r32 = r68;
        0qQ.A0B(r32, 2);
        AnonymousClass9HC r2 = r69;
        0qQ.A0B(r2, 3);
        AnonymousClass7LQ r4 = r70;
        0qQ.A0B(r4, 4);
        AnonymousClass9LB r13 = new AnonymousClass9LB(userSession2, 28);
        AnonymousClass7ZD r9 = (AnonymousClass7ZD) userSession2.A01(AnonymousClass7ZC.class, AnonymousClass7ZB.A00);
        C254703su r7 = r4.A0e;
        AnonymousClass7FT A002 = AnonymousClass7FG.A00(context2, userSession2, r2, r4, r7.A10);
        0qQ.A0B(r9, 5);
        AnonymousClass7SD r12 = r4.A0G;
        if (r12.A08 == 29) {
            z = r12.A0n;
        } else {
            z = true;
        }
        Object obj = r7.A1T;
        if (!(obj instanceof C254873tC)) {
            if (obj instanceof List) {
                0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                if (((List) obj).get(0) instanceof C254873tC) {
                    Object obj2 = r7.A1T;
                    0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    obj = ((List) obj2).get(0);
                }
            }
            throw new IllegalArgumentException("Unexpected message content object type");
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.GenericFBAttachment");
        C254873tC r52 = (C254873tC) obj;
        C2606546n r10 = r52.A0O;
        if (r10 != null || r4.A0G.A08 == 29) {
            String str4 = null;
            if (r10 != null) {
                r20 = C70863OPc.A01(context2, userSession2, r4, r32.A03, r10, r7.A2P, r4.A0G.A0x, 0qQ.A0K(userSession2.A06, r7.BsI()), false);
            } else {
                r20 = null;
            }
            AnonymousClass7SD r11 = r4.A0G;
            C254793t3 r102 = r11.A0P;
            if (r52.A0D == 0 || !z) {
                A02 = AnonymousClass775.A02(r102, r11.A08);
            } else {
                if (r102 != null && C300965yF.A02(r102) != null) {
                    str3 = C300965yF.A01(r102).A00;
                } else if (r102 instanceof MsysThreadId) {
                    str3 = String.valueOf(((MsysThreadId) r102).A00);
                } else {
                    str3 = null;
                }
                A02 = 0mp.A06("instagram://thread/%s/group_polls/%s", new Object[]{str3, Long.valueOf(r52.A0D)});
            }
            String str5 = r7.A1u;
            0qQ.A07(str5);
            AnonymousClass9J6 r03 = new AnonymousClass9J6(A02, str5, 5);
            ImmutableList A01 = r52.A01();
            if (A01 != null) {
                arrayList = new ArrayList(0Yv.A1E(A01, 10));
                Iterator it = A01.iterator();
                while (it.hasNext()) {
                    AnonymousClass9JN r04 = (AnonymousClass9JN) it.next();
                    String str6 = r04.A04;
                    String str7 = r04.A05;
                    if (z) {
                        A022 = r04.A02;
                    } else {
                        A022 = AnonymousClass775.A02(r102, r4.A0G.A08);
                    }
                    C61078JwG jwG = (C61078JwG) r04.A01;
                    if (jwG == null || (bbv = (BBV) jwG.A00) == null) {
                        str2 = null;
                    } else {
                        str2 = bbv.A00;
                    }
                    arrayList.add(new AnonymousClass9JN((Integer) r04.A00, str6, str7, A022, str2, r04.A03));
                }
            } else {
                arrayList = null;
            }
            if (r4.A0G.A08 == 29 || r9.A02(r7.A0g())) {
                17i r112 = (17i) r13.invoke();
                int i = r4.A0G.A08;
                String str8 = r52.A17;
                if (str8 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    0qQ.A0B(r112, 1);
                    ImageUrl imageUrl = r52.A0N;
                    if (imageUrl == null) {
                        User A023 = r112.A02(r52.A16);
                        if (A023 != null) {
                            imageUrl = A023.Bh3();
                        } else {
                            imageUrl = null;
                        }
                    }
                    String str9 = r52.A19;
                    if (str9 == null) {
                        str9 = "";
                    }
                    if (i == 29) {
                        z2 = true;
                        r0 = A00(r52.A1W);
                    } else {
                        z2 = false;
                        List<String> list = r52.A1Z;
                        if (list != null) {
                            r0 = new ArrayList();
                            for (String A024 : list) {
                                User A025 = r112.A02(A024);
                                if (A025 != null) {
                                    r0.add(A025.Bh3());
                                }
                            }
                        } else {
                            r0 = 0sn.A00;
                        }
                    }
                    arrayList2.add(new C68140N2g(str9, r0, r52.A03, r52.A0H));
                    String str10 = r52.A1A;
                    if (str10 != null) {
                        if (z2) {
                            r02 = A00(r52.A1X);
                        } else {
                            List<String> list2 = r52.A1a;
                            if (list2 != null) {
                                r02 = new ArrayList();
                                for (String A026 : list2) {
                                    User A027 = r112.A02(A026);
                                    if (A027 != null) {
                                        r02.add(A027.Bh3());
                                    }
                                }
                            } else {
                                r02 = 0sn.A00;
                            }
                        }
                        arrayList2.add(new C68140N2g(str10, r02, r52.A04, r52.A0I));
                        String str11 = r52.A1B;
                        if (str11 != null) {
                            if (z2) {
                                r8 = A00(r52.A1Y);
                            } else {
                                List<String> list3 = r52.A1b;
                                if (list3 != null) {
                                    r8 = new ArrayList();
                                    for (String A028 : list3) {
                                        User A029 = r112.A02(A028);
                                        if (A029 != null) {
                                            r8.add(A029.Bh3());
                                        }
                                    }
                                } else {
                                    r8 = 0sn.A00;
                                }
                            }
                            arrayList2.add(new C68140N2g(str11, r8, r52.A05, r52.A0J));
                        }
                    }
                    long j = r52.A0D;
                    String str12 = r52.A18;
                    r22 = new AnonymousClass77A(imageUrl, str8, str12, arrayList2, j);
                    String str13 = r52.A14;
                    String str14 = "";
                    if (str13 == null) {
                        str13 = str14;
                    }
                    String str15 = r52.A15;
                    if (str15 == null) {
                        str15 = str14;
                    }
                    if (str12 != null) {
                        str14 = str12;
                    }
                    String string = context2.getString(2131960010, new Object[]{r22.A02, r52.A13, str13, str15, str14});
                    0qQ.A07(string);
                    if (arrayList == null || (r1 = (AnonymousClass9JN) 00k.A0O(arrayList, 0)) == null || (str = r1.A04) == null) {
                        str = context2.getResources().getString(2131960021);
                        0qQ.A07(str);
                    }
                    r5 = new AnonymousClass9J6(string, str, 3);
                } else {
                    throw new IllegalStateException("poll message require a question");
                }
            } else {
                r5 = null;
                r22 = null;
            }
            DirectMessageIdentifier A0V = r7.A0V();
            C254883tD r29 = C254883tD.SINGLE;
            User user = r4.A0K;
            if (user != null) {
                str4 = user.getUsername();
            }
            return new C328667Fr((C376649Iu) null, (C376649Iu) null, (AnonymousClass9J0) null, r03, r5, (AnonymousClass9J6) null, (C61062Jw0) null, r20, A002, r32, (AnonymousClass74T) null, (AnonymousClass774) null, (AnonymousClass777) null, (AnonymousClass778) null, r22, (AnonymousClass5FY) null, r29, (AnonymousClass779) null, A0V, (C254793t3) null, (GifUrlImpl) null, (ImageInfo) null, (CharSequence) null, (Long) null, (Long) null, (Long) null, str4, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, arrayList, (List) null, (List) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
        }
        throw new IllegalArgumentException("Poll Message missing action log");
    }

    public static final List A00(List list) {
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new SimpleImageUrl((String) it.next()));
        }
        return arrayList;
    }
}
