package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.reels.question.constants.QuestionStickerType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vnt  reason: case insensitive filesystem */
public abstract class C18229Vnt {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.ULl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v5, types: [X.UKx, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x018d, code lost:
        if (r3 == false) goto L_0x018f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.ULl A01(X.C317966o8 r7) {
        /*
            r5 = 0
            r3 = 0
            java.lang.String r6 = ""
            r1 = 0
            java.lang.String r4 = "#ffffff"
            r0 = 1050253722(0x3e99999a, float:0.3)
            X.ULl r2 = new X.ULl
            r2.<init>()
            r2.A0L = r6
            X.ULl.A00(r2)
            r2.A0Y = r4
            r2.A0X = r4
            r2.A03 = r0
            r2.A0D = r5
            r2.A0C = r5
            r2.A0H = r5
            r2.A0S = r5
            r2.A0c = r5
            r2.A0d = r5
            r2.A0I = r5
            r2.A0F = r5
            r2.A09 = r1
            r2.A0N = r5
            r2.A0E = r5
            r2.A0R = r6
            r2.A0K = r6
            r2.A0b = r5
            r2.A0T = r6
            r2.A0U = r6
            X.ULl.A01(r2)
            java.lang.String r0 = r7.A0S
            X.0qQ.A0B(r0, r1)
            r2.A0L = r0
            java.lang.String r0 = r7.A0U
            r2.A0P = r0
            com.instagram.common.typedurl.ImageUrl r0 = r7.A0H
            if (r0 == 0) goto L_0x014f
            java.lang.String r0 = r0.getUrl()
        L_0x0050:
            r2.A0M = r0
            float r0 = r7.A01()
            r2.A02 = r0
            float r0 = r7.A01
            r2.A01 = r0
            float r0 = r7.A00
            r2.A00 = r0
            float r0 = r7.A07
            r2.A06 = r0
            java.lang.String r0 = r7.A0d
            r2.A0W = r0
            int r0 = r7.A08
            r2.A07 = r0
            float r0 = r7.A05
            r2.A04 = r0
            float r0 = r7.A06
            r2.A05 = r0
            java.lang.String r0 = r7.A0h
            r2.A0a = r0
            java.lang.String r0 = r7.A0f
            X.0qQ.A0B(r0, r1)
            r2.A0Y = r0
            java.lang.String r0 = r7.A0e
            X.0qQ.A0B(r0, r1)
            r2.A0X = r0
            float r0 = r7.A04
            r2.A03 = r0
            com.instagram.model.venue.LocationDict r0 = r7.A0K
            if (r0 == 0) goto L_0x014c
            X.XMC r0 = X.C21520Xdm.A01(r0)
        L_0x0092:
            r2.A0D = r0
            com.instagram.model.hashtag.HashtagImpl r4 = r7.A0J
            if (r4 == 0) goto L_0x0103
            X.UKx r3 = new X.UKx
            r3.<init>()
            r3.A00 = r5
            r3.A01 = r5
            r3.A07 = r5
            r3.A08 = r5
            r3.A0A = r5
            r3.A02 = r5
            r3.A0B = r5
            r3.A03 = r5
            r3.A04 = r5
            r3.A09 = r5
            r3.A0C = r5
            r3.A05 = r5
            r3.A0D = r5
            r3.A0E = r5
            r3.A0F = r5
            r3.A06 = r5
            java.lang.Boolean r0 = r4.A01
            r3.A00 = r0
            java.lang.Boolean r0 = r4.A02
            r3.A01 = r0
            java.lang.Integer r0 = r4.A08
            r3.A07 = r0
            java.lang.Integer r0 = r4.A09
            r3.A08 = r0
            java.lang.String r0 = r4.A0B
            r3.A0A = r0
            java.lang.Boolean r0 = r4.A03
            r3.A02 = r0
            java.lang.String r0 = r4.A0C
            r3.A0B = r0
            java.lang.Boolean r0 = r4.A04
            r3.A03 = r0
            java.lang.Boolean r0 = r4.A05
            r3.A04 = r0
            java.lang.Integer r0 = r4.A0A
            r3.A09 = r0
            java.lang.String r0 = r4.A0D
            r3.A0C = r0
            java.lang.Boolean r0 = r4.A06
            r3.A05 = r0
            com.instagram.common.typedurl.ImageUrl r0 = r4.A00
            if (r0 == 0) goto L_0x014a
            java.lang.String r0 = r0.getUrl()
        L_0x00f5:
            r3.A0D = r0
            java.lang.String r0 = r4.A0E
            r3.A0E = r0
            java.lang.String r0 = r4.A0F
            r3.A0F = r0
            java.lang.Boolean r0 = r4.A07
            r3.A06 = r0
        L_0x0103:
            r2.A0C = r3
            java.lang.String r0 = r7.A0N
            r2.A0H = r0
            java.lang.String r0 = r7.A0Y
            r2.A0S = r0
            java.util.List r0 = r7.A0n
            if (r0 == 0) goto L_0x0152
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0119:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0152
            java.lang.Object r0 = r4.next()
            com.instagram.reels.question.constants.QuestionStickerType r0 = (com.instagram.reels.question.constants.QuestionStickerType) r0
            X.0qQ.A0A(r0)
            int r3 = X.DbU.A02(r0, r1)
            r0 = 5
            if (r3 == r0) goto L_0x0147
            r0 = 3
            if (r3 == r0) goto L_0x0144
            r0 = 2
            if (r3 == r0) goto L_0x0141
            r0 = 1
            if (r3 == r0) goto L_0x013e
            X.UxO r0 = X.C16571UxO.UNKNOWN
        L_0x013a:
            r5.add(r0)
            goto L_0x0119
        L_0x013e:
            X.UxO r0 = X.C16571UxO.ANON
            goto L_0x013a
        L_0x0141:
            X.UxO r0 = X.C16571UxO.LOCATION
            goto L_0x013a
        L_0x0144:
            X.UxO r0 = X.C16571UxO.MUSIC
            goto L_0x013a
        L_0x0147:
            X.UxO r0 = X.C16571UxO.TEXT
            goto L_0x013a
        L_0x014a:
            r0 = 0
            goto L_0x00f5
        L_0x014c:
            r0 = 0
            goto L_0x0092
        L_0x014f:
            r0 = 0
            goto L_0x0050
        L_0x0152:
            r2.A0c = r5
            java.util.List r0 = r7.A0m
            if (r0 == 0) goto L_0x017d
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r0 == 0) goto L_0x017d
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0166:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x017e
            java.lang.Object r0 = r3.next()
            com.instagram.reels.question.model.responsetype.QuestionResponseType r0 = (com.instagram.reels.question.model.responsetype.QuestionResponseType) r0
            X.0qQ.A0A(r0)
            X.UxN r0 = X.C18228Vns.A01(r0)
            r4.add(r0)
            goto L_0x0166
        L_0x017d:
            r4 = 0
        L_0x017e:
            r2.A0d = r4
            java.lang.String r0 = r7.A0P
            r2.A0I = r0
            java.lang.Boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x018f
            boolean r3 = r0.booleanValue()
            r0 = 1
            if (r3 != 0) goto L_0x0190
        L_0x018f:
            r0 = 0
        L_0x0190:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0F = r0
            int r0 = r7.A0A
            r2.A09 = r0
            com.google.common.collect.ImmutableList r0 = r7.A03()
            if (r0 == 0) goto L_0x0200
            java.lang.Object r0 = X.00k.A0J(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x01a6:
            r2.A0N = r0
            X.6o8 r0 = r7.A0I
            if (r0 == 0) goto L_0x01fe
            X.ULl r0 = A01(r0)
        L_0x01b0:
            r2.A0E = r0
            java.lang.String r0 = r7.A0X
            X.0qQ.A0B(r0, r1)
            r2.A0R = r0
            java.lang.String r0 = r7.A0R
            X.0qQ.A0B(r0, r1)
            r2.A0K = r0
            java.util.List r0 = r7.A0j
            if (r0 != 0) goto L_0x01f9
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x01c8:
            r2.A0b = r0
            java.lang.String r0 = r7.A0a
            X.0qQ.A0B(r0, r1)
            r2.A0T = r0
            java.lang.String r0 = r7.A0b
            X.0qQ.A0B(r0, r1)
            r2.A0U = r0
            java.lang.String r0 = r7.A0W
            r2.A0Q = r0
            java.lang.String r0 = r7.A0T
            r2.A0O = r0
            int r0 = r7.A0B
            r2.A0A = r0
            java.lang.String r0 = r7.A0g
            r2.A0Z = r0
            long r0 = r7.A0F
            r2.A0B = r0
            java.lang.String r0 = r7.A0c
            r2.A0V = r0
            java.lang.String r0 = r7.A0M
            r2.A0G = r0
            int r0 = r7.A09
            r2.A08 = r0
            return r2
        L_0x01f9:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            goto L_0x01c8
        L_0x01fe:
            r0 = 0
            goto L_0x01b0
        L_0x0200:
            r0 = 0
            goto L_0x01a6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18229Vnt.A01(X.6o8):X.ULl");
    }

    public static final C317966o8 A00(ULl uLl) {
        SimpleImageUrl simpleImageUrl;
        ArrayList arrayList;
        ArrayList arrayList2;
        QuestionStickerType questionStickerType;
        SimpleImageUrl simpleImageUrl2;
        ULl uLl2 = uLl;
        String str = uLl2.A0L;
        String str2 = uLl2.A0P;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        String str4 = uLl2.A0M;
        C317966o8 r1 = null;
        if (str4 != null) {
            simpleImageUrl = new SimpleImageUrl(str4);
        } else {
            simpleImageUrl = null;
        }
        float f = uLl2.A01;
        float f2 = uLl2.A00;
        float f3 = uLl2.A02;
        int i = uLl2.A08;
        C317966o8 r2 = new C317966o8();
        r2.A0S = str;
        r2.A0U = str2;
        r2.A0H = simpleImageUrl;
        r2.A01 = f;
        r2.A00 = f2;
        r2.A02 = f3;
        r2.A09 = i;
        r2.A07 = uLl2.A06;
        r2.A0d = uLl2.A0W;
        r2.A08 = uLl2.A07;
        r2.A05 = uLl2.A04;
        r2.A06 = uLl2.A05;
        String str5 = uLl2.A0a;
        if (str5 != null) {
            str3 = str5;
        }
        r2.A0h = str3;
        r2.A0f = uLl2.A0Y;
        r2.A0e = uLl2.A0X;
        r2.A04 = uLl2.A03;
        XMC xmc = uLl2.A0D;
        if (xmc != null) {
            r2.A0K = C21520Xdm.A00(xmc);
        }
        C15044UKx uKx = uLl2.A0C;
        if (uKx != null) {
            Boolean bool = uKx.A00;
            Boolean bool2 = uKx.A01;
            Integer num = uKx.A07;
            Integer num2 = uKx.A08;
            String str6 = uKx.A0A;
            Boolean bool3 = uKx.A02;
            String str7 = uKx.A0B;
            Boolean bool4 = uKx.A03;
            Boolean bool5 = uKx.A04;
            Integer num3 = uKx.A09;
            String str8 = uKx.A0C;
            Boolean bool6 = uKx.A05;
            String str9 = uKx.A0D;
            if (str9 != null) {
                simpleImageUrl2 = new SimpleImageUrl(str9);
            } else {
                simpleImageUrl2 = null;
            }
            String str10 = uKx.A0E;
            String str11 = uKx.A0F;
            Boolean bool7 = bool3;
            Boolean bool8 = bool4;
            Boolean bool9 = bool5;
            SimpleImageUrl simpleImageUrl3 = simpleImageUrl2;
            Boolean bool10 = bool;
            r2.A0J = new HashtagImpl(simpleImageUrl3, bool10, bool2, bool7, bool8, bool9, bool6, uKx.A06, num, num2, num3, str6, str7, str8, str10, str11);
        }
        r2.A0N = uLl2.A0H;
        r2.A0Y = uLl2.A0S;
        List<C16571UxO> list = uLl2.A0c;
        if (list != null) {
            arrayList = AnonymousClass7TF.A0p(list);
            for (C16571UxO A02 : list) {
                int A022 = DbU.A02(A02, 0);
                if (A022 == 1) {
                    questionStickerType = QuestionStickerType.TEXT;
                } else if (A022 == 2) {
                    questionStickerType = QuestionStickerType.MUSIC;
                } else if (A022 == 3) {
                    questionStickerType = QuestionStickerType.LOCATION;
                } else if (A022 != 4) {
                    questionStickerType = QuestionStickerType.UNRECOGNIZED;
                } else {
                    questionStickerType = QuestionStickerType.ANON;
                }
                arrayList.add(questionStickerType);
            }
        } else {
            arrayList = 0sn.A00;
        }
        r2.A0n = arrayList;
        List<C16570UxN> list2 = uLl2.A0d;
        if (list2 != null) {
            arrayList2 = AnonymousClass7TF.A0p(list2);
            for (C16570UxN A00 : list2) {
                arrayList2.add(C18228Vns.A00(A00));
            }
        } else {
            arrayList2 = 0sn.A00;
        }
        r2.A0m = arrayList2;
        r2.A0P = uLl2.A0I;
        r2.A0L = uLl2.A0F;
        r2.A0A = uLl2.A09;
        r2.A05(AnonymousClass7TE.A1I(uLl2.A0N));
        ULl uLl3 = uLl2.A0E;
        if (uLl3 != null) {
            r1 = A00(uLl3);
        }
        r2.A0I = r1;
        r2.A0X = uLl2.A0R;
        r2.A0R = uLl2.A0K;
        0sn r0 = uLl2.A0b;
        if (r0 == null) {
            r0 = 0sn.A00;
        }
        r2.A0j = r0;
        r2.A0a = uLl2.A0T;
        r2.A0b = uLl2.A0U;
        r2.A0W = uLl2.A0Q;
        r2.A0T = uLl2.A0O;
        r2.A0B = uLl2.A0A;
        r2.A0g = uLl2.A0Z;
        r2.A0F = uLl2.A0B;
        r2.A0c = uLl2.A0V;
        r2.A0M = uLl2.A0G;
        return r2;
    }
}
