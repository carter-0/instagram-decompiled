package X;

import java.util.Comparator;
import java.util.List;

public final class MAY implements Comparator {
    public final int A00;

    public MAY(int i) {
        this.A00 = i;
    }

    public static List A00(Iterable iterable, int i) {
        return 00k.A0g(iterable, new MAY(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        return X.29b.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e4, code lost:
        return X.29b.A00(r3, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0039;
                case 2: goto L_0x004b;
                case 3: goto L_0x0039;
                case 4: goto L_0x005d;
                case 5: goto L_0x0067;
                case 6: goto L_0x00a6;
                case 7: goto L_0x00b8;
                case 8: goto L_0x00ca;
                case 9: goto L_0x00ca;
                case 10: goto L_0x00e0;
                case 11: goto L_0x00f6;
                case 12: goto L_0x0108;
                case 13: goto L_0x011a;
                case 14: goto L_0x0128;
                case 15: goto L_0x013a;
                case 16: goto L_0x001a;
                case 17: goto L_0x014c;
                case 18: goto L_0x0005;
                case 19: goto L_0x015e;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x017b;
                case 23: goto L_0x018c;
                case 24: goto L_0x01b5;
                case 25: goto L_0x01cc;
                case 26: goto L_0x01cc;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.Juu r7 = (X.C60998Juu) r7
            X.0eP r0 = r7.A08
            java.lang.Object r1 = r0.A00
            java.lang.Long r1 = (java.lang.Long) r1
            X.Juu r6 = (X.C60998Juu) r6
            X.0eP r0 = r6.A08
            java.lang.Object r0 = r0.A00
            java.lang.Long r0 = (java.lang.Long) r0
        L_0x0015:
            int r1 = X.29b.A00(r1, r0)
            return r1
        L_0x001a:
            X.0eP r6 = (X.0eP) r6
            java.lang.Object r1 = r6.A00
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.0eP r7 = (X.0eP) r7
            java.lang.Object r0 = r7.A00
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0015
        L_0x0027:
            X.JuK r6 = (X.C60962JuK) r6
            long r0 = r6.A04
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.JuK r7 = (X.C60962JuK) r7
            long r0 = r7.A04
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x01e0
        L_0x0039:
            X.Jun r6 = (X.C60991Jun) r6
            long r0 = r6.A01
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.Jun r7 = (X.C60991Jun) r7
            long r0 = r7.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x01e0
        L_0x004b:
            X.Jun r7 = (X.C60991Jun) r7
            long r0 = r7.A01
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.Jun r6 = (X.C60991Jun) r6
            long r0 = r6.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x01e0
        L_0x005d:
            X.TqH r6 = (X.C14122TqH) r6
            X.TqH r7 = (X.C14122TqH) r7
            int r1 = r7.A04
            int r0 = r6.A04
            int r1 = r1 - r0
            return r1
        L_0x0067:
            X.Ja7 r7 = (X.C59832Ja7) r7
            java.lang.String r0 = r7.A02
            r4 = 0
            r2 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r7.A01
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r7.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x00a4
        L_0x0083:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            X.Ja7 r6 = (X.C59832Ja7) r6
            java.lang.String r0 = r6.A02
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r6.A01
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r6.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x009e
            r4 = 1
        L_0x009e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            goto L_0x01e0
        L_0x00a4:
            r2 = 0
            goto L_0x0083
        L_0x00a6:
            X.GNY r7 = (X.GNY) r7
            float r0 = r7.A00
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            X.GNY r6 = (X.GNY) r6
            float r0 = r6.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x01e0
        L_0x00b8:
            X.8vc r7 = (X.C369968vc) r7
            boolean r0 = r7.A0G
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            X.8vc r6 = (X.C369968vc) r6
            boolean r0 = r6.A0G
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x01e0
        L_0x00ca:
            X.UOk r6 = (X.C15092UOk) r6
            int r0 = r6.A01()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.UOk r7 = (X.C15092UOk) r7
            int r0 = r7.A01()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01e0
        L_0x00e0:
            X.JuM r6 = (X.C60964JuM) r6
            X.L0W r0 = r6.A03
            int r0 = r0.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.JuM r7 = (X.C60964JuM) r7
            X.L0W r0 = r7.A03
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01e0
        L_0x00f6:
            X.LMn r6 = (X.C64094LMn) r6
            int r0 = r6.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.LMn r7 = (X.C64094LMn) r7
            int r0 = r7.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01e0
        L_0x0108:
            X.L4A r6 = (X.L4A) r6
            long r0 = r6.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.L4A r7 = (X.L4A) r7
            long r0 = r7.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x01e0
        L_0x011a:
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            java.lang.String r3 = r6.getUsername()
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            java.lang.String r0 = r7.getUsername()
            goto L_0x01e0
        L_0x0128:
            X.Jv7 r6 = (X.C61008Jv7) r6
            int r0 = r6.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.Jv7 r7 = (X.C61008Jv7) r7
            int r0 = r7.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01e0
        L_0x013a:
            com.instagram.direct.emojipong.data.EmojiPongUser r7 = (com.instagram.direct.emojipong.data.EmojiPongUser) r7
            int r0 = r7.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            com.instagram.direct.emojipong.data.EmojiPongUser r6 = (com.instagram.direct.emojipong.data.EmojiPongUser) r6
            int r0 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01e0
        L_0x014c:
            com.instagram.direct.messagethread.reactions.model.ReactionViewModel r7 = (com.instagram.direct.messagethread.reactions.model.ReactionViewModel) r7
            boolean r0 = r7.A08
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            com.instagram.direct.messagethread.reactions.model.ReactionViewModel r6 = (com.instagram.direct.messagethread.reactions.model.ReactionViewModel) r6
            boolean r0 = r6.A08
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x01e0
        L_0x015e:
            com.instagram.common.gallery.Medium r7 = (com.instagram.common.gallery.Medium) r7
            X.8gB r0 = r7.A0F
            if (r0 == 0) goto L_0x0179
            float r0 = r0.A00
        L_0x0166:
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            com.instagram.common.gallery.Medium r6 = (com.instagram.common.gallery.Medium) r6
            X.8gB r0 = r6.A0F
            if (r0 == 0) goto L_0x0177
            float r0 = r0.A00
        L_0x0172:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x01e0
        L_0x0177:
            r0 = 0
            goto L_0x0172
        L_0x0179:
            r0 = 0
            goto L_0x0166
        L_0x017b:
            X.3Q2 r6 = (X.AnonymousClass3Q2) r6
            long r0 = r6.A0g
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.3Q2 r7 = (X.AnonymousClass3Q2) r7
            long r0 = r7.A0g
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x01e0
        L_0x018c:
            X.L9x r6 = (X.C63868L9x) r6
            java.lang.Integer r0 = r6.A03
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x01b1;
                case 2: goto L_0x01b3;
                default: goto L_0x0197;
            }
        L_0x0197:
            r0 = 0
        L_0x0198:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.L9x r7 = (X.C63868L9x) r7
            java.lang.Integer r0 = r7.A03
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x01ad;
                case 2: goto L_0x01af;
                default: goto L_0x01a7;
            }
        L_0x01a7:
            r0 = 0
        L_0x01a8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01e0
        L_0x01ad:
            r0 = 1
            goto L_0x01a8
        L_0x01af:
            r0 = 2
            goto L_0x01a8
        L_0x01b1:
            r0 = 1
            goto L_0x0198
        L_0x01b3:
            r0 = 2
            goto L_0x0198
        L_0x01b5:
            com.instagram.common.gallery.model.GalleryItem r7 = (com.instagram.common.gallery.model.GalleryItem) r7
            X.LQs r2 = X.C64153LQs.A00
            long r0 = r2.A01(r7)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            com.instagram.common.gallery.model.GalleryItem r6 = (com.instagram.common.gallery.model.GalleryItem) r6
            long r0 = r2.A01(r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x01e0
        L_0x01cc:
            com.instagram.user.model.UpcomingEvent r6 = (com.instagram.user.model.UpcomingEvent) r6
            long r0 = X.C18810W3l.A02(r6)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            com.instagram.user.model.UpcomingEvent r7 = (com.instagram.user.model.UpcomingEvent) r7
            long r0 = X.C18810W3l.A02(r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x01e0:
            int r1 = X.29b.A00(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MAY.compare(java.lang.Object, java.lang.Object):int");
    }
}
