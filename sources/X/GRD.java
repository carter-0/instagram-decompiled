package X;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.newsfeed.ui.InlineLinkUrn;
import java.util.Locale;
import java.util.regex.Matcher;

public abstract class GRD {
    public static final void A00(C286575Wy r20, C303876Bd r21, int i) {
        int i2;
        C286575Wy r5 = r20;
        r5.ExV(1808565762);
        int i3 = i;
        C303876Bd r3 = r21;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r5, r3, i3) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1143716292, "com.instagram.newsfeed.ui.applyHashtagAnnotation (NewsfeedStoryMessageState.kt:169)");
            }
            Matcher matcher = C253063q9.A01().matcher(r3.A02().A00);
            0qQ.A07(matcher);
            while (matcher.find()) {
                r5.ExS(1607792714);
                String group = matcher.group(1);
                if (group != null) {
                    Uri.Builder authority = new Uri.Builder().authority("hashtag");
                    String lowerCase = group.toLowerCase(Locale.ROOT);
                    0qQ.A07(lowerCase);
                    String obj = authority.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, 00l.A0F("#", lowerCase)).build().toString();
                    0qQ.A07(obj);
                    int start = matcher.start(1);
                    int end = matcher.end(1);
                    r3.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, AnonymousClass5aQ.A00(r5).A0Y, 0, 0), start, end);
                    r3.A0A("InlineLinkUrn", C250863mB.A03.A02(new InlineLinkUrn(group, obj), C66928MfN.A00), start, end);
                }
                C286565Wx.A0L((C286565Wx) r5, false);
            }
            if (0fL.A02()) {
                0fL.A00(-1026517716);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r3, i3, 30);
        }
    }

    public static final void A01(C286575Wy r20, C303876Bd r21, int i) {
        int i2;
        C286575Wy r5 = r20;
        r5.ExV(1728680484);
        int i3 = i;
        C303876Bd r3 = r21;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r5, r3, i3) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1884719905, "com.instagram.newsfeed.ui.applyMentionAnnotation (NewsfeedStoryMessageState.kt:195)");
            }
            Matcher A09 = 0mp.A09(r3.A02().A00);
            while (A09.find()) {
                r5.ExS(1939667852);
                String group = A09.group(1);
                if (group != null) {
                    Uri.Builder authority = new Uri.Builder().authority("mention");
                    String lowerCase = group.toLowerCase(Locale.ROOT);
                    0qQ.A07(lowerCase);
                    String obj = authority.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, 00l.A0F("@", lowerCase)).build().toString();
                    0qQ.A07(obj);
                    int start = A09.start(1);
                    int end = A09.end(1);
                    r3.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, AnonymousClass5aQ.A00(r5).A0Y, 0, 0), start, end);
                    r3.A0A("InlineLinkUrn", C250863mB.A03.A02(new InlineLinkUrn(group, obj), C66928MfN.A00), start, end);
                }
                C286565Wx.A0L((C286565Wx) r5, false);
            }
            if (0fL.A02()) {
                0fL.A00(1155206072);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r3, i3, 31);
        }
    }
}
