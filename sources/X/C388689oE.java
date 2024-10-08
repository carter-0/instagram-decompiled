package X;

import java.util.List;

/* renamed from: X.9oE  reason: invalid class name and case insensitive filesystem */
public abstract class C388689oE extends AVJ {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: X.9X3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.U1a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: X.9X2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: X.9X3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: X.9X3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: X.9X3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C369948va A01(android.content.Context r22, android.graphics.drawable.Drawable r23, android.graphics.drawable.Drawable r24, com.instagram.common.session.UserSession r25, java.lang.String r26) {
        /*
            r21 = this;
            r1 = r21
            boolean r0 = r1 instanceof X.C388679oD
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r15 = r26
            if (r0 == 0) goto L_0x0098
            r3 = r1
            X.9oD r3 = (X.C388679oD) r3
            r7 = 0
            r6 = 1
            r5 = 4
            r4 = 2
            r3.A01 = r11
            X.82i r9 = r3.A0A
            com.instagram.user.model.User r8 = r9.A05
            java.lang.String r2 = r3.A0C
            X.9Tg r1 = r9.A02
            java.lang.String r0 = r3.A05()
            X.A6i r14 = new X.A6i
            r14.<init>(r1, r8, r2, r0)
            X.9Tg r0 = r14.A01
            int r0 = r0.ordinal()
            java.lang.String r2 = "Required value was null."
            if (r0 == r7) goto L_0x0067
            if (r0 != r6) goto L_0x0062
            X.8JI r0 = r9.A00
            int r1 = r0.ordinal()
            if (r1 == r7) goto L_0x006f
            if (r1 == r5) goto L_0x006f
            if (r1 == r6) goto L_0x0053
            if (r1 == r4) goto L_0x004c
            r0 = 3
            if (r1 == r0) goto L_0x004c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x004c:
            java.lang.String r0 = "Visual Reply unsupported for creation state"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0053:
            if (r23 == 0) goto L_0x005d
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r3.A08
            X.9X2 r9 = new X.9X2
            r9.<init>(r10, r11, r0, r14)
            goto L_0x008b
        L_0x005d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0062:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0067:
            if (r23 == 0) goto L_0x0093
            X.U1a r9 = new X.U1a
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x008b
        L_0x006f:
            if (r23 == 0) goto L_0x008e
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r3.A08
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r19 = r0.getWidth()
            int r20 = r0.getHeight()
            X.9X3 r9 = new X.9X3
            r15 = r9
            r16 = r10
            r17 = r11
            r18 = r14
            r15.<init>(r16, r17, r18, r19, r20)
        L_0x008b:
            r3.A02 = r9
            return r9
        L_0x008e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0093:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0098:
            X.0qQ.A0A(r11)
            r14 = 0
            X.U1a r9 = new X.U1a
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C388689oE.A01(android.content.Context, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, com.instagram.common.session.UserSession, java.lang.String):X.8va");
    }

    public final AnonymousClass804 A02() {
        AnonymousClass0eM r0;
        if (this instanceof C388669oC) {
            r0 = ((C388669oC) this).A02;
        } else {
            r0 = ((C388679oD) this).A0E;
        }
        return (AnonymousClass804) r0.getValue();
    }

    public final List A03(AnonymousClass804 r4, String str) {
        String str2;
        String str3;
        if (this instanceof C388679oD) {
            0qQ.A0B(r4, 0);
            int ordinal = ((C388679oD) this).A0A.A02.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw AnonymousClass7TE.A1K();
                } else if (r4 instanceof AnonymousClass803) {
                    str3 = "clips_remix_side_by_side";
                    return AnonymousClass7TE.A1I(str3);
                }
            }
            C317876nz r0 = C317876nz.A0a;
            if (str != null) {
                str3 = 002.A0R("reel_mention_post_", str);
            } else {
                str3 = "mention_reshare_music_sticker_id";
            }
            return AnonymousClass7TE.A1I(str3);
        }
        C317876nz r02 = C317876nz.A0a;
        if (str != null) {
            str2 = 002.A0R("reel_mention_post_", str);
        } else {
            str2 = "mention_reshare_music_sticker_id";
        }
        return AnonymousClass7TE.A1I(str2);
    }

    public final AnonymousClass804[] A04() {
        AnonymousClass0eM r0;
        if (this instanceof C388679oD) {
            r0 = ((C388679oD) this).A0F;
        } else {
            r0 = ((C388669oC) this).A03;
        }
        return (AnonymousClass804[]) r0.getValue();
    }
}
