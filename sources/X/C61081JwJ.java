package X;

import android.graphics.Bitmap;
import com.instagram.api.schemas.ClipsTemplatesStickerType;
import com.instagram.api.schemas.ISOCountryCode;
import com.instagram.api.schemas.StickerTraySectionCTAType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.messagethread.reactions.model.ReactionViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.user.model.User;
import go.Seq;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.JwJ  reason: case insensitive filesystem */
public final class C61081JwJ extends AnonymousClass0T0 {
    public Object A00;
    public String A01;
    public final int A02;

    public static ReactionViewModel A00(C61081JwJ jwJ, UserSession userSession) {
        User user = (User) jwJ.A00;
        String str = jwJ.A01;
        boolean A0K = 0qQ.A0K(AnonymousClass0t1.A01.A01(userSession), user);
        0qQ.A0B(user, 1);
        return AnonymousClass50m.A00(userSession, (ImageUrl) null, user, str, A0K, true, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0140, code lost:
        if ((r4 instanceof X.C61081JwJ) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0142, code lost:
        r4 = (X.C61081JwJ) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0146, code lost:
        if (r4.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x014c, code lost:
        if (r3.A00 == r4.A00) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0178, code lost:
        if ((r4 instanceof X.C61081JwJ) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x017a, code lost:
        r4 = (X.C61081JwJ) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x017e, code lost:
        if (r4.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0188, code lost:
        if (X.0qQ.A0K(r3.A00, r4.A00) != false) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x018b, code lost:
        r1 = r3.A01;
        r0 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x019b, code lost:
        if ((r4 instanceof X.C61081JwJ) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x019d, code lost:
        r4 = (X.C61081JwJ) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01a1, code lost:
        if (r4.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01ab, code lost:
        if (X.0qQ.A0K(r3.A01, r4.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01ad, code lost:
        r1 = r3.A00;
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01b5, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bb, code lost:
        return X.0qQ.A0K(r3.A01, ((X.C61081JwJ) r4).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0102, code lost:
        if ((r4 instanceof X.C61081JwJ) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0104, code lost:
        r4 = (X.C61081JwJ) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0108, code lost:
        if (r4.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0112, code lost:
        if (X.0qQ.A0K(r3.A01, r4.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0118, code lost:
        if (r3.A00 == r4.A00) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x0042;
                case 1: goto L_0x0047;
                case 2: goto L_0x000a;
                case 3: goto L_0x0005;
                case 4: goto L_0x003d;
                case 5: goto L_0x004c;
                case 6: goto L_0x0051;
                case 7: goto L_0x0056;
                case 8: goto L_0x005b;
                case 9: goto L_0x0061;
                case 10: goto L_0x0067;
                case 11: goto L_0x006d;
                case 12: goto L_0x0073;
                case 13: goto L_0x0079;
                case 14: goto L_0x007f;
                case 15: goto L_0x0085;
                case 16: goto L_0x008a;
                case 17: goto L_0x0090;
                case 18: goto L_0x00bc;
                case 19: goto L_0x00c1;
                case 20: goto L_0x009c;
                case 21: goto L_0x00c7;
                case 22: goto L_0x00cd;
                case 23: goto L_0x00d3;
                case 24: goto L_0x00d9;
                case 25: goto L_0x00df;
                case 26: goto L_0x00e5;
                case 27: goto L_0x00ea;
                case 28: goto L_0x00f0;
                case 29: goto L_0x00f6;
                case 30: goto L_0x00fc;
                case 31: goto L_0x011c;
                case 32: goto L_0x0005;
                case 33: goto L_0x0121;
                case 34: goto L_0x0126;
                case 35: goto L_0x012b;
                case 36: goto L_0x0130;
                case 37: goto L_0x0135;
                case 38: goto L_0x013a;
                case 39: goto L_0x0005;
                case 40: goto L_0x014f;
                case 41: goto L_0x0154;
                case 42: goto L_0x0159;
                case 43: goto L_0x015e;
                case 44: goto L_0x0163;
                case 45: goto L_0x0168;
                case 46: goto L_0x016d;
                case 47: goto L_0x0172;
                case 48: goto L_0x0190;
                case 49: goto L_0x0195;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r2 = super.equals(r4)
        L_0x0009:
            return r2
        L_0x000a:
            if (r3 == r4) goto L_0x01bc
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r0 = X.JTR.A0v(r4)
            boolean r0 = X.0qQ.A0K(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.pushlite.common.NotifContent"
            X.0qQ.A0C(r4, r0)
            X.JwJ r4 = (X.C61081JwJ) r4
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0009
            java.lang.Object r1 = r3.A00
            byte[] r1 = (byte[]) r1
            java.lang.Object r0 = r4.A00
            byte[] r0 = (byte[]) r0
            if (r1 == 0) goto L_0x01b9
            if (r0 == 0) goto L_0x0009
            boolean r2 = java.util.Arrays.equals(r1, r0)
            return r2
        L_0x003d:
            if (r3 == r4) goto L_0x01bc
            r1 = 4
            goto L_0x0199
        L_0x0042:
            if (r3 == r4) goto L_0x01bc
            r1 = 0
            goto L_0x0176
        L_0x0047:
            if (r3 == r4) goto L_0x01bc
            r1 = 1
            goto L_0x0176
        L_0x004c:
            if (r3 == r4) goto L_0x01bc
            r1 = 5
            goto L_0x0199
        L_0x0051:
            if (r3 == r4) goto L_0x01bc
            r1 = 6
            goto L_0x0100
        L_0x0056:
            if (r3 == r4) goto L_0x01bc
            r1 = 7
            goto L_0x0176
        L_0x005b:
            if (r3 == r4) goto L_0x01bc
            r1 = 8
            goto L_0x0100
        L_0x0061:
            if (r3 == r4) goto L_0x01bc
            r1 = 9
            goto L_0x0176
        L_0x0067:
            if (r3 == r4) goto L_0x01bc
            r1 = 10
            goto L_0x0176
        L_0x006d:
            if (r3 == r4) goto L_0x01bc
            r1 = 11
            goto L_0x0176
        L_0x0073:
            if (r3 == r4) goto L_0x01bc
            r1 = 12
            goto L_0x013e
        L_0x0079:
            if (r3 == r4) goto L_0x01bc
            r1 = 13
            goto L_0x0176
        L_0x007f:
            if (r3 == r4) goto L_0x01bc
            r1 = 14
            goto L_0x0199
        L_0x0085:
            if (r3 == r4) goto L_0x01bc
            r1 = 15
            goto L_0x0100
        L_0x008a:
            if (r3 == r4) goto L_0x01bc
            r1 = 16
            goto L_0x0176
        L_0x0090:
            if (r3 == r4) goto L_0x01bc
            if (r4 == 0) goto L_0x01b7
            boolean r0 = X.DbY.A1b(r3, r4)
            if (r0 != 0) goto L_0x00b1
            goto L_0x01b7
        L_0x009c:
            if (r3 == r4) goto L_0x01bc
            java.lang.Class r1 = X.JTR.A0v(r4)
            java.lang.Class r0 = r3.getClass()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01b7
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.clips.viewer.ui.state.comment.ClipsViewerCommentPreviewsModel"
            X.0qQ.A0C(r4, r0)
        L_0x00b1:
            X.JwJ r4 = (X.C61081JwJ) r4
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            boolean r2 = X.0qQ.A0K(r1, r0)
            return r2
        L_0x00bc:
            if (r3 == r4) goto L_0x01bc
            r1 = 18
            goto L_0x013e
        L_0x00c1:
            if (r3 == r4) goto L_0x01bc
            r1 = 19
            goto L_0x0199
        L_0x00c7:
            if (r3 == r4) goto L_0x01bc
            r1 = 21
            goto L_0x0199
        L_0x00cd:
            if (r3 == r4) goto L_0x01bc
            r1 = 22
            goto L_0x0199
        L_0x00d3:
            if (r3 == r4) goto L_0x01bc
            r1 = 23
            goto L_0x0176
        L_0x00d9:
            if (r3 == r4) goto L_0x01bc
            r1 = 24
            goto L_0x0199
        L_0x00df:
            if (r3 == r4) goto L_0x01bc
            r1 = 25
            goto L_0x0176
        L_0x00e5:
            if (r3 == r4) goto L_0x01bc
            r1 = 26
            goto L_0x013e
        L_0x00ea:
            if (r3 == r4) goto L_0x01bc
            r1 = 27
            goto L_0x0199
        L_0x00f0:
            if (r3 == r4) goto L_0x01bc
            r1 = 28
            goto L_0x0199
        L_0x00f6:
            if (r3 == r4) goto L_0x01bc
            r1 = 29
            goto L_0x0199
        L_0x00fc:
            if (r3 == r4) goto L_0x01bc
            r1 = 30
        L_0x0100:
            boolean r0 = r4 instanceof X.C61081JwJ
            if (r0 == 0) goto L_0x01b7
            X.JwJ r4 = (X.C61081JwJ) r4
            int r0 = r4.A02
            if (r0 != r1) goto L_0x01b7
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r1 = r3.A00
            java.lang.Object r0 = r4.A00
            if (r1 == r0) goto L_0x01bc
            goto L_0x01b7
        L_0x011c:
            if (r3 == r4) goto L_0x01bc
            r1 = 31
            goto L_0x0199
        L_0x0121:
            if (r3 == r4) goto L_0x01bc
            r1 = 33
            goto L_0x013e
        L_0x0126:
            if (r3 == r4) goto L_0x01bc
            r1 = 34
            goto L_0x0199
        L_0x012b:
            if (r3 == r4) goto L_0x01bc
            r1 = 35
            goto L_0x0176
        L_0x0130:
            if (r3 == r4) goto L_0x01bc
            r1 = 36
            goto L_0x0199
        L_0x0135:
            if (r3 == r4) goto L_0x01bc
            r1 = 37
            goto L_0x0176
        L_0x013a:
            if (r3 == r4) goto L_0x01bc
            r1 = 38
        L_0x013e:
            boolean r0 = r4 instanceof X.C61081JwJ
            if (r0 == 0) goto L_0x01b7
            X.JwJ r4 = (X.C61081JwJ) r4
            int r0 = r4.A02
            if (r0 != r1) goto L_0x01b7
            java.lang.Object r1 = r3.A00
            java.lang.Object r0 = r4.A00
            if (r1 == r0) goto L_0x018b
            goto L_0x01b7
        L_0x014f:
            if (r3 == r4) goto L_0x01bc
            r1 = 40
            goto L_0x0176
        L_0x0154:
            if (r3 == r4) goto L_0x01bc
            r1 = 41
            goto L_0x0199
        L_0x0159:
            if (r3 == r4) goto L_0x01bc
            r1 = 42
            goto L_0x0199
        L_0x015e:
            if (r3 == r4) goto L_0x01bc
            r1 = 43
            goto L_0x0199
        L_0x0163:
            if (r3 == r4) goto L_0x01bc
            r1 = 44
            goto L_0x0176
        L_0x0168:
            if (r3 == r4) goto L_0x01bc
            r1 = 45
            goto L_0x0199
        L_0x016d:
            if (r3 == r4) goto L_0x01bc
            r1 = 46
            goto L_0x0176
        L_0x0172:
            if (r3 == r4) goto L_0x01bc
            r1 = 47
        L_0x0176:
            boolean r0 = r4 instanceof X.C61081JwJ
            if (r0 == 0) goto L_0x01b7
            X.JwJ r4 = (X.C61081JwJ) r4
            int r0 = r4.A02
            if (r0 != r1) goto L_0x01b7
            java.lang.Object r1 = r3.A00
            java.lang.Object r0 = r4.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x018b
            goto L_0x01b7
        L_0x018b:
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            goto L_0x01b1
        L_0x0190:
            if (r3 == r4) goto L_0x01bc
            r1 = 48
            goto L_0x0199
        L_0x0195:
            if (r3 == r4) goto L_0x01bc
            r1 = 49
        L_0x0199:
            boolean r0 = r4 instanceof X.C61081JwJ
            if (r0 == 0) goto L_0x01b7
            X.JwJ r4 = (X.C61081JwJ) r4
            int r0 = r4.A02
            if (r0 != r1) goto L_0x01b7
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r1 = r3.A00
            java.lang.Object r0 = r4.A00
        L_0x01b1:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x01bc
        L_0x01b7:
            r2 = 0
            return r2
        L_0x01b9:
            if (r0 == 0) goto L_0x01bc
            return r2
        L_0x01bc:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61081JwJ.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r1 = X.C51966G9m.A04(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        r2 = r4.A00.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00db, code lost:
        r3 = r1 * 31;
        r1 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        if (r1 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e1, code lost:
        r2 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ee, code lost:
        if (r1 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f0, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fa, code lost:
        r2 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0105, code lost:
        r3 = r1 * 31;
        r2 = r4.A01.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014a, code lost:
        return r2 + r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r4 = this;
            int r1 = r4.A02
            switch(r1) {
                case 0: goto L_0x013b;
                case 1: goto L_0x00ff;
                case 2: goto L_0x0127;
                case 3: goto L_0x0005;
                case 4: goto L_0x000a;
                case 5: goto L_0x000a;
                case 6: goto L_0x010e;
                case 7: goto L_0x00ff;
                case 8: goto L_0x00f2;
                case 9: goto L_0x00ff;
                case 10: goto L_0x013b;
                case 11: goto L_0x00ff;
                case 12: goto L_0x00d5;
                case 13: goto L_0x00ff;
                case 14: goto L_0x000a;
                case 15: goto L_0x00cc;
                case 16: goto L_0x00ff;
                case 17: goto L_0x00c1;
                case 18: goto L_0x009d;
                case 19: goto L_0x000a;
                case 20: goto L_0x0096;
                case 21: goto L_0x0086;
                case 22: goto L_0x007d;
                case 23: goto L_0x013b;
                case 24: goto L_0x006d;
                case 25: goto L_0x00ff;
                case 26: goto L_0x00ff;
                case 27: goto L_0x00e6;
                case 28: goto L_0x000a;
                case 29: goto L_0x000a;
                case 30: goto L_0x0063;
                case 31: goto L_0x000a;
                case 32: goto L_0x0005;
                case 33: goto L_0x004c;
                case 34: goto L_0x000a;
                case 35: goto L_0x00ff;
                case 36: goto L_0x000a;
                case 37: goto L_0x013b;
                case 38: goto L_0x0031;
                case 39: goto L_0x0005;
                case 40: goto L_0x00d5;
                case 41: goto L_0x000a;
                case 42: goto L_0x0021;
                case 43: goto L_0x0021;
                case 44: goto L_0x013b;
                case 45: goto L_0x0011;
                case 46: goto L_0x00ff;
                case 47: goto L_0x013b;
                case 48: goto L_0x000a;
                case 49: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r2 = super.hashCode()
            return r2
        L_0x000a:
            java.lang.String r1 = r4.A01
            int r3 = X.AnonymousClass7TE.A0O(r1)
            goto L_0x008e
        L_0x0011:
            java.lang.String r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0E(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A00
            int r3 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0149
        L_0x0021:
            java.lang.String r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0E(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A00
            int r3 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0149
        L_0x0031:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x003d;
                case 2: goto L_0x0040;
                case 3: goto L_0x0043;
                case 4: goto L_0x0046;
                case 5: goto L_0x0049;
                default: goto L_0x003a;
            }
        L_0x003a:
            java.lang.String r1 = "UNRECOGNIZED"
            goto L_0x0057
        L_0x003d:
            java.lang.String r1 = "IN_REVIEW"
            goto L_0x0057
        L_0x0040:
            java.lang.String r1 = "REJECTED"
            goto L_0x0057
        L_0x0043:
            java.lang.String r1 = "SAFETY_WARNING"
            goto L_0x0057
        L_0x0046:
            java.lang.String r1 = "TAKEN_DOWN"
            goto L_0x0057
        L_0x0049:
            java.lang.String r1 = "TURN_LIMITED"
            goto L_0x0057
        L_0x004c:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x005d;
                case 2: goto L_0x0060;
                default: goto L_0x0055;
            }
        L_0x0055:
            java.lang.String r1 = "COMMENT"
        L_0x0057:
            int r1 = X.C51966G9m.A04(r1, r2)
            goto L_0x0105
        L_0x005d:
            java.lang.String r1 = "COMMENT_REPLY"
            goto L_0x0057
        L_0x0060:
            java.lang.String r1 = "UNKNOWN"
            goto L_0x0057
        L_0x0063:
            java.lang.String r1 = r4.A01
            int r3 = X.AnonymousClass7TE.A0O(r1)
            java.lang.Object r1 = r4.A00
            goto L_0x00fa
        L_0x006d:
            java.lang.String r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0E(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A00
            int r3 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0149
        L_0x007d:
            java.lang.String r1 = r4.A01
            int r3 = X.AnonymousClass7TE.A0O(r1)
            java.lang.Object r1 = r4.A00
            goto L_0x00fa
        L_0x0086:
            java.lang.String r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0E(r1)
            int r3 = r1 * 31
        L_0x008e:
            java.lang.Object r1 = r4.A00
            int r2 = r1.hashCode()
            goto L_0x0149
        L_0x0096:
            java.lang.String r1 = r4.A01
            int r2 = r1.hashCode()
            return r2
        L_0x009d:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x00ad;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00be;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            java.lang.String r1 = "DRAFTS_V1_EXCEPTION"
        L_0x00a8:
            int r1 = X.C51966G9m.A04(r1, r2)
            goto L_0x00db
        L_0x00ad:
            r1 = 2346(0x92a, float:3.287E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            goto L_0x00a8
        L_0x00b4:
            r1 = 2196(0x894, float:3.077E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            goto L_0x00a8
        L_0x00bb:
            java.lang.String r1 = "NO_VIDEO_SEGMENTS"
            goto L_0x00a8
        L_0x00be:
            java.lang.String r1 = "MISSING_VIDEO_FILES"
            goto L_0x00a8
        L_0x00c1:
            java.lang.String r1 = r4.A01
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            int r2 = java.util.Arrays.hashCode(r1)
            return r2
        L_0x00cc:
            java.lang.String r1 = r4.A01
            int r3 = X.AnonymousClass7TE.A0O(r1)
            java.lang.Object r1 = r4.A00
            goto L_0x00fa
        L_0x00d5:
            java.lang.Object r1 = r4.A00
            int r1 = r1.hashCode()
        L_0x00db:
            int r3 = r1 * 31
            java.lang.String r1 = r4.A01
            if (r1 == 0) goto L_0x00f0
            int r2 = r1.hashCode()
            goto L_0x0149
        L_0x00e6:
            java.lang.String r1 = r4.A01
            int r3 = X.AnonymousClass7TE.A0O(r1)
            java.lang.Object r1 = r4.A00
            if (r1 != 0) goto L_0x00fa
        L_0x00f0:
            r2 = 0
            goto L_0x0149
        L_0x00f2:
            java.lang.String r1 = r4.A01
            int r3 = X.AnonymousClass7TE.A0O(r1)
            java.lang.Object r1 = r4.A00
        L_0x00fa:
            int r2 = r1.hashCode()
            goto L_0x0149
        L_0x00ff:
            java.lang.Object r1 = r4.A00
            int r1 = r1.hashCode()
        L_0x0105:
            int r3 = r1 * 31
            java.lang.String r1 = r4.A01
            int r2 = r1.hashCode()
            goto L_0x0149
        L_0x010e:
            java.lang.String r1 = r4.A01
            int r3 = X.AnonymousClass7TE.A0O(r1)
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x0124
            java.lang.String r1 = "ENABLED"
        L_0x011f:
            int r2 = X.C51966G9m.A04(r1, r2)
            goto L_0x0149
        L_0x0124:
            java.lang.String r1 = "DISABLED"
            goto L_0x011f
        L_0x0127:
            java.lang.String r1 = r4.A01
            r3 = 0
            int r1 = X.JTR.A0G(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A00
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x0149
            int r3 = java.util.Arrays.hashCode(r1)
            goto L_0x0149
        L_0x013b:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.String r1 = r4.A01
            int r3 = X.C41845B3m.A00(r1)
        L_0x0149:
            int r2 = r2 + r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61081JwJ.hashCode():int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007a, code lost:
        r1.append(r0);
        r1.append(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009b, code lost:
        r0 = ')';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009d, code lost:
        r1.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a4, code lost:
        return r1.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r3 = this;
            int r0 = r3.A02
            switch(r0) {
                case 4: goto L_0x0083;
                case 16: goto L_0x0066;
                case 18: goto L_0x0030;
                case 35: goto L_0x001b;
                case 47: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = super.toString()
            return r0
        L_0x000a:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "NudityDetectionResultData(predictions="
            r1.append(r0)
            java.lang.Object r0 = r3.A00
            r1.append(r0)
            java.lang.String r0 = ", error="
            goto L_0x007a
        L_0x001b:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "DirectAggregatedMediaViewerViewpointData(media="
            r1.append(r0)
            java.lang.Object r0 = r3.A00
            r1.append(r0)
            r0 = 49
            java.lang.String r0 = X.C66579MXk.A00(r0)
            goto L_0x007a
        L_0x0030:
            java.lang.String r2 = r3.A01
            r0 = 91
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r1.append(r0)
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TE.A0M(r0)
            switch(r0) {
                case 1: goto L_0x004e;
                case 2: goto L_0x0051;
                case 3: goto L_0x0054;
                case 4: goto L_0x0057;
                default: goto L_0x0044;
            }
        L_0x0044:
            java.lang.String r0 = "drafts_v1_exception"
        L_0x0046:
            if (r2 != 0) goto L_0x005a
            r1.append(r0)
            r0 = 93
            goto L_0x009d
        L_0x004e:
            java.lang.String r0 = "loading_exception"
            goto L_0x0046
        L_0x0051:
            java.lang.String r0 = "draft_does_not_exist"
            goto L_0x0046
        L_0x0054:
            java.lang.String r0 = "no_video_segments"
            goto L_0x0046
        L_0x0057:
            java.lang.String r0 = "missing_video_files"
            goto L_0x0046
        L_0x005a:
            r1.append(r0)
            java.lang.String r0 = "] "
            r1.append(r0)
            r1.append(r2)
            goto L_0x00a0
        L_0x0066:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "AIStickerContextualSuggestionItem(sticker="
            r1.append(r0)
            java.lang.Object r0 = r3.A00
            r1.append(r0)
            r0 = 840(0x348, float:1.177E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x007a:
            r1.append(r0)
            java.lang.String r0 = r3.A01
            r1.append(r0)
            goto L_0x009b
        L_0x0083:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "KeyboardInputMethod(name="
            r1.append(r0)
            java.lang.String r0 = r3.A01
            r1.append(r0)
            java.lang.String r0 = ", languages="
            r1.append(r0)
            java.lang.Object r0 = r3.A00
            r1.append(r0)
        L_0x009b:
            r0 = 41
        L_0x009d:
            r1.append(r0)
        L_0x00a0:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61081JwJ.toString():java.lang.String");
    }

    public C61081JwJ(String str, int i, Integer num) {
        this.A02 = i;
        if (18 - i != 0) {
            AnonymousClass7TG.A1O(num, str);
        } else {
            0qQ.A0B(num, 1);
        }
        this.A00 = num;
        this.A01 = str;
    }

    public C61081JwJ(List list, int i, String str) {
        this.A02 = i;
        switch (i) {
            case 4:
            case 14:
            case Seq.NULL_REFNUM:
                0qQ.A0B(str, 1);
                break;
            case 17:
            case 19:
            case 20:
            case 32:
                0qQ.A0B(str, 1);
                break;
        }
        0qQ.A0B(list, 2);
        this.A01 = str;
        this.A00 = list;
    }

    public C61081JwJ(C266444Yx r2, String str) {
        this.A02 = 13;
        0qQ.A0B(str, 2);
        this.A00 = r2;
        this.A01 = str;
    }

    public C61081JwJ(C266444Yx r2, String str, int i) {
        this.A02 = 34;
        0qQ.A0B(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public C61081JwJ(C361278fx r2, String str) {
        this.A02 = 28;
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = r2;
    }

    public C61081JwJ(Bitmap bitmap, String str) {
        this.A02 = 25;
        0qQ.A0B(str, 2);
        this.A00 = bitmap;
        this.A01 = str;
    }

    public C61081JwJ(ISOCountryCode iSOCountryCode, String str) {
        this.A02 = 12;
        0qQ.A0B(iSOCountryCode, 1);
        this.A00 = iSOCountryCode;
        this.A01 = str;
    }

    public C61081JwJ(C46620Di0 di0, String str) {
        this.A02 = 1;
        this.A00 = di0;
        this.A01 = str;
    }

    public C61081JwJ(1Xj r2, String str) {
        this.A02 = 35;
        this.A00 = r2;
        this.A01 = str;
    }

    public C61081JwJ(StickerTraySectionCTAType stickerTraySectionCTAType, String str) {
        this.A02 = 26;
        this.A00 = stickerTraySectionCTAType;
        this.A01 = str;
    }

    public C61081JwJ(String str, C62320sa r3) {
        this.A02 = 49;
        this.A01 = str;
        this.A00 = r3;
    }

    public C61081JwJ(C239973Ja r2, String str) {
        this.A02 = 36;
        this.A01 = str;
        this.A00 = r2;
    }

    public C61081JwJ(C362088hK r2, String str) {
        this.A02 = 30;
        this.A01 = str;
        this.A00 = r2;
    }

    public C61081JwJ(C48126EWs eWs, String str) {
        this.A02 = 15;
        this.A01 = str;
        this.A00 = eWs;
    }

    public C61081JwJ(C61081JwJ jwJ, String str) {
        this.A02 = 27;
        this.A01 = str;
        this.A00 = jwJ;
    }

    public C61081JwJ(C70487O8m o8m, String str) {
        this.A02 = 48;
        this.A01 = str;
        this.A00 = o8m;
    }

    public C61081JwJ(C59721JVf jVf, String str) {
        this.A02 = 11;
        AnonymousClass7TG.A1O(jVf, str);
        this.A00 = jVf;
        this.A01 = str;
    }

    public C61081JwJ(ClipsTemplatesStickerType clipsTemplatesStickerType, String str) {
        this.A02 = 8;
        AnonymousClass7TG.A1O(str, clipsTemplatesStickerType);
        this.A01 = str;
        this.A00 = clipsTemplatesStickerType;
    }

    public C61081JwJ(String str, 0sP r3) {
        this.A02 = 29;
        AnonymousClass7TG.A1O(str, r3);
        this.A01 = str;
        this.A00 = r3;
    }

    public C61081JwJ(String str, Integer num, int i) {
        this.A02 = 6;
        AnonymousClass7TG.A1O(str, num);
        this.A01 = str;
        this.A00 = num;
    }

    public C61081JwJ(AudioOverlayTrack audioOverlayTrack, String str) {
        this.A02 = 40;
        this.A00 = audioOverlayTrack;
        this.A01 = str;
    }

    public C61081JwJ(User user, String str, int i) {
        this.A02 = i;
        AnonymousClass7TG.A1O(user, str);
        this.A00 = user;
        this.A01 = str;
    }

    public C61081JwJ(List list, String str, int i) {
        this.A02 = i;
        if (10 - i != 0) {
            AnonymousClass7TG.A1O(list, str);
        }
        this.A00 = list;
        this.A01 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61081JwJ(Integer num, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this("", AnonymousClass05K.A01, 6);
        this.A02 = 6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61081JwJ() {
        this("", 38, AnonymousClass05K.A00);
        this.A02 = 38;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61081JwJ(int r3) {
        /*
            r2 = this;
            r2.A02 = r3
            r1 = 0
            int r3 = 43 - r3
            if (r3 == 0) goto L_0x000f
            r0 = 45
        L_0x0009:
            r2.A02 = r0
            r2.<init>((java.lang.String) r1, (java.lang.Object) r1, (int) r0)
            return
        L_0x000f:
            r0 = 43
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61081JwJ.<init>(int):void");
    }

    public C61081JwJ(String str) {
        this.A02 = 22;
        UUID randomUUID = UUID.randomUUID();
        this.A02 = 22;
        0qQ.A0B(randomUUID, 2);
        this.A01 = str;
        this.A00 = randomUUID;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61081JwJ(Throwable th) {
        this((String) null, (Object) th, 3);
        this.A02 = 3;
    }

    public C61081JwJ(String str, Object obj, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public C61081JwJ(String str, Map map, int i) {
        this.A02 = i;
        this.A01 = str;
        this.A00 = map;
    }
}
