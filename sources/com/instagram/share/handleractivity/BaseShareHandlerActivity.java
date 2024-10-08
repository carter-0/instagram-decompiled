package com.instagram.share.handleractivity;

import X.0Tu;
import X.0kR;
import X.0lT;
import X.0lU;
import X.0qQ;
import X.182;
import X.18g;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass14B;
import X.C10993S4n;
import X.C2594141p;
import X.C273614ms;
import X.C61170le;
import X.C638918c;
import X.C9851RiQ;
import X.C9852RiR;
import X.DbS;
import X.Pxi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.base.activity.IgActivity;
import com.instagram.common.session.UserSession;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import java.io.IOException;

public abstract class BaseShareHandlerActivity extends IgActivity implements AnonymousClass0iw, 0lT {
    public final void Ctd(Activity activity) {
    }

    public final void Cte(Activity activity) {
    }

    public final void Ctf(Activity activity) {
        0qQ.A0B(activity, 0);
        if ((activity instanceof C273614ms) || (activity instanceof SignedOutFragmentActivity)) {
            finish();
        }
    }

    public final void Cth(Activity activity) {
    }

    public final void Ctm(Activity activity) {
    }

    public final void Ctn(Activity activity) {
    }

    public final void Cto(Activity activity) {
    }

    public final void Ctp(Activity activity, boolean z) {
    }

    public final String getModuleName() {
        return "share_handler";
    }

    public final void onNewIntent(Intent intent) {
        0qQ.A0B(intent, 0);
        setIntent(intent);
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0178, code lost:
        if (r2 != null) goto L_0x017a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r28 = this;
            r0 = r28
            boolean r1 = r0.A04()
            if (r1 != 0) goto L_0x0101
            boolean r1 = r0 instanceof com.instagram.share.handleractivity.ClipsMusicShareHandlerActivity
            if (r1 == 0) goto L_0x00e9
            com.instagram.common.session.UserSession r6 = r0.A01()
            r3 = 0
            if (r6 == 0) goto L_0x0049
            com.instagram.common.session.UserSession r1 = r0.A01()
            if (r1 == 0) goto L_0x0083
            X.S4n r10 = X.C9851RiQ.A00(r1)
        L_0x001d:
            java.lang.String r9 = "Required value was null."
            if (r10 == 0) goto L_0x03ba
            long r4 = r10.A01
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0036
            X.1QP r4 = r10.A02
            r2 = 980420125(0x3a70061d, float:9.1561844E-4)
            java.lang.String r1 = "ClipsThirdPartyShareLogger"
            long r1 = r4.flowStartForMarker(r2, r1, r3)
            r10.A01 = r1
        L_0x0036:
            X.0Tu r4 = X.0Tu.A05
            r1 = 36320326514123049(0x81092500002129, double:3.032458965522874E-306)
            boolean r1 = X.182.A06(r4, r6, r1)
            if (r1 != 0) goto L_0x0057
            java.lang.String r1 = "music_share_not_enabled"
        L_0x0046:
            r10.A00(r1)
        L_0x0049:
            r3 = 2131973479(0x7f135567, float:1.9583995E38)
            r2 = 1
            java.lang.String r1 = "share_intent_app_not_supported"
            X.C59689JTv.A01(r0, r1, r3, r2)
        L_0x0053:
            r0.A03(r2)
            return
        L_0x0057:
            android.content.Intent r2 = r0.getIntent()
            r1 = 559(0x22f, float:7.83E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r11 = r2.getStringExtra(r1)
            if (r11 == 0) goto L_0x007f
            int r1 = r11.length()
            if (r1 == 0) goto L_0x007f
            r1 = 36883276467798515(0x830925000401f3, double:3.388470783044754E-306)
            java.lang.String r1 = X.182.A04(r4, r6, r1)
            boolean r1 = X.AET.A02(r11, r1)
            if (r1 != 0) goto L_0x0085
            java.lang.String r1 = "app_not_supported"
            goto L_0x0046
        L_0x007f:
            java.lang.String r1 = "missing_app_id"
            goto L_0x0046
        L_0x0083:
            r10 = 0
            goto L_0x001d
        L_0x0085:
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r2 = r1.getPackage()
            if (r2 == 0) goto L_0x00fc
            java.lang.String r1 = "com.instagram.android"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00fc
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r1 = "com.instagram.platform.extra.SONG_ISRC"
            java.lang.String r8 = r4.getStringExtra(r1)
            if (r8 == 0) goto L_0x00f7
            int r7 = r8.length()
            if (r7 == 0) goto L_0x00f7
            r1 = 12
            if (r7 != r1) goto L_0x00f3
            r5 = 0
        L_0x00ae:
            char r4 = r8.charAt(r5)
            r1 = 65
            if (r1 > r4) goto L_0x00ec
            r1 = 91
            if (r4 < r1) goto L_0x00c2
            r1 = 97
            if (r1 > r4) goto L_0x00f3
            r1 = 123(0x7b, float:1.72E-43)
        L_0x00c0:
            if (r4 >= r1) goto L_0x00f3
        L_0x00c2:
            int r5 = r5 + 1
            if (r5 < r7) goto L_0x00ae
            android.content.Intent r1 = r0.getIntent()
            X.0qQ.A07(r1)
            X.Jvw r1 = X.C9853RiS.A00(r0, r1, r6)
            java.lang.String r12 = r1.A04
            java.lang.String r13 = X.Pxi.A0a(r0)
            if (r13 == 0) goto L_0x03bf
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r14 = r1.getType()
            r15 = r2
            r16 = r3
            r17 = r3
            r10.A01(r11, r12, r13, r14, r15, r16, r17)
        L_0x00e9:
            r2 = 0
            goto L_0x0053
        L_0x00ec:
            r1 = 48
            if (r1 > r4) goto L_0x00f3
            r1 = 58
            goto L_0x00c0
        L_0x00f3:
            java.lang.String r1 = "invalid_song_isrc"
            goto L_0x0046
        L_0x00f7:
            java.lang.String r1 = "missing_song_isrc"
            goto L_0x0046
        L_0x00fc:
            java.lang.String r1 = "package_not_specified"
            goto L_0x0046
        L_0x0101:
            boolean r1 = r0 instanceof com.instagram.share.handleractivity.ShareHandlerActivity
            if (r1 == 0) goto L_0x015e
            java.lang.String r2 = X.Pxi.A0a(r0)
            java.lang.String r1 = "android.intent.action.SEND"
            boolean r2 = X.0qQ.A0K(r2, r1)
            java.lang.String r3 = "android.intent.extra.STREAM"
            android.content.Intent r1 = r0.getIntent()
            if (r2 == 0) goto L_0x0140
            android.os.Parcelable r1 = r1.getParcelableExtra(r3)
            if (r1 == 0) goto L_0x015b
            java.util.List r2 = X.AnonymousClass7TE.A1I(r1)
        L_0x0121:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
        L_0x0123:
            X.JVH r3 = new X.JVH
            r3.<init>(r1, r2)
        L_0x0128:
            r2 = 0
            java.lang.Object r7 = r3.A02
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x0049
            java.lang.Object r6 = r3.A04
            java.util.List r6 = (java.util.List) r6
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x03c4
            java.lang.Object r1 = r3.A03
            if (r1 != 0) goto L_0x03c4
            r2 = 1
            goto L_0x0053
        L_0x0140:
            java.lang.String r2 = r1.getAction()
            java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x015b
            android.content.Intent r1 = r0.getIntent()
            java.util.ArrayList r1 = r1.getParcelableArrayListExtra(r3)
            if (r1 == 0) goto L_0x015b
            java.util.List r2 = X.00k.A0X(r1)
            goto L_0x0121
        L_0x015b:
            X.0sn r2 = X.0sn.A00
            goto L_0x0121
        L_0x015e:
            boolean r1 = r0 instanceof com.instagram.share.handleractivity.ReelShareHandlerActivity
            if (r1 == 0) goto L_0x018b
            java.lang.String r2 = X.Pxi.A0a(r0)
            java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
            boolean r3 = X.0qQ.A0K(r2, r1)
            java.lang.String r2 = "android.intent.extra.STREAM"
            android.content.Intent r1 = r0.getIntent()
            if (r3 == 0) goto L_0x017d
            java.util.ArrayList r2 = r1.getParcelableArrayListExtra(r2)
            if (r2 == 0) goto L_0x0188
        L_0x017a:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0123
        L_0x017d:
            android.os.Parcelable r1 = r1.getParcelableExtra(r2)
            if (r1 == 0) goto L_0x0188
            java.util.List r2 = X.AnonymousClass7TE.A1I(r1)
            goto L_0x017a
        L_0x0188:
            X.0sn r2 = X.0sn.A00
            goto L_0x017a
        L_0x018b:
            boolean r1 = r0 instanceof com.instagram.share.handleractivity.ClipsThreadShareHandlerActivity
            if (r1 == 0) goto L_0x0213
            android.os.Bundle r2 = X.DbU.A06(r0)
            if (r2 == 0) goto L_0x0049
            java.lang.String r1 = "interactive_asset_uri"
            android.os.Parcelable r4 = r2.getParcelable(r1)
            android.net.Uri r4 = (android.net.Uri) r4
            if (r4 == 0) goto L_0x0049
            android.os.Bundle r2 = X.DbU.A06(r0)
            if (r2 == 0) goto L_0x0210
            java.lang.String r1 = "content_url"
            java.lang.String r2 = r2.getString(r1)
            if (r2 == 0) goto L_0x0210
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0210
            android.net.Uri r5 = X.0cp.A03(r2)
        L_0x01b7:
            android.content.Intent r2 = r0.getIntent()
            r1 = 559(0x22f, float:7.83E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r7 = r2.getStringExtra(r1)
            if (r7 == 0) goto L_0x0049
            int r1 = r7.length()
            if (r1 == 0) goto L_0x0049
            com.instagram.common.session.UserSession r2 = r0.A01()
            if (r2 == 0) goto L_0x0049
            android.content.Intent r1 = r0.getIntent()
            X.0qQ.A07(r1)
            X.Jvw r1 = X.C9853RiS.A00(r0, r1, r2)
            java.lang.String r2 = r1.A04
            java.lang.String r1 = "com.instagram.barcelona"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = X.Pxi.A0a(r0)
            java.lang.String.valueOf(r1)
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r1 = r1.getType()
            java.lang.String.valueOf(r1)
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r1 = r1.getPackage()
            java.lang.String.valueOf(r1)
            X.0sn r8 = X.0sn.A00
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            X.JVH r3 = new X.JVH
            r3.<init>((android.net.Uri) r4, (android.net.Uri) r5, (java.lang.Integer) r6, (java.lang.String) r7, (java.util.List) r8)
            goto L_0x0128
        L_0x0210:
            android.net.Uri r5 = android.net.Uri.EMPTY
            goto L_0x01b7
        L_0x0213:
            boolean r1 = r0 instanceof com.instagram.share.handleractivity.ClipsShareHandlerActivity
            if (r1 == 0) goto L_0x0049
            com.instagram.common.session.UserSession r4 = r0.A01()
            r11 = 0
            if (r4 == 0) goto L_0x0049
            com.instagram.common.session.UserSession r1 = r0.A01()
            if (r1 == 0) goto L_0x0409
            X.S4n r3 = X.C9851RiQ.A00(r1)
            if (r3 == 0) goto L_0x0409
            long r5 = r3.A01
            r18 = 0
            int r1 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r1 != 0) goto L_0x0240
            X.1QP r6 = r3.A02
            r5 = 980420125(0x3a70061d, float:9.1561844E-4)
            java.lang.String r2 = "ClipsThirdPartyShareLogger"
            r1 = 0
            long r1 = r6.flowStartForMarker(r5, r2, r1)
            r3.A01 = r1
        L_0x0240:
            android.content.Intent r2 = r0.getIntent()
            r1 = 559(0x22f, float:7.83E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r6 = r2.getStringExtra(r1)
            if (r6 == 0) goto L_0x02ff
            int r9 = r6.length()
            if (r9 == 0) goto L_0x02ff
            android.content.Intent r1 = r0.getIntent()
            X.0qQ.A07(r1)
            X.Jvw r1 = X.C9853RiS.A00(r0, r1, r4)
            java.lang.String r2 = r1.A04
            android.os.Bundle r5 = X.DbU.A06(r0)
            if (r5 == 0) goto L_0x0271
            java.lang.String r1 = "interactive_asset_uri"
            android.os.Parcelable r11 = r5.getParcelable(r1)
            android.net.Uri r11 = (android.net.Uri) r11
        L_0x0271:
            android.os.Bundle r5 = X.DbU.A06(r0)
            if (r5 == 0) goto L_0x02fc
            java.lang.String r1 = "content_url"
            java.lang.String r5 = r5.getString(r1)
            if (r5 == 0) goto L_0x02fc
            int r1 = r5.length()
            if (r1 == 0) goto L_0x02fc
            android.net.Uri r10 = X.0cp.A03(r5)
        L_0x0289:
            java.lang.String r1 = X.Pxi.A0a(r0)
            java.lang.String r12 = java.lang.String.valueOf(r1)
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r1 = r1.getType()
            java.lang.String r13 = java.lang.String.valueOf(r1)
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r1 = r1.getPackage()
            java.lang.String r8 = java.lang.String.valueOf(r1)
            boolean r26 = X.AnonymousClass7TF.A1V(r11)
            android.net.Uri r7 = android.net.Uri.EMPTY
            boolean r27 = X.C51966G9m.A1a(r10, r7)
            r23 = r12
            r24 = r13
            r25 = r8
            r20 = r3
            r21 = r6
            r22 = r2
            r20.A01(r21, r22, r23, r24, r25, r26, r27)
            X.0Tu r5 = X.0Tu.A05
            r1 = 36318200505833462(0x810736000817f6, double:3.031114469319791E-306)
            boolean r15 = X.182.A06(r5, r4, r1)
            r1 = 36881150458790260(0x83073600010174, double:3.3871262863871826E-306)
            java.lang.String r14 = X.182.A04(r5, r4, r1)
            r1 = 36881150458986870(0x83073600040176, double:3.3871262865115196E-306)
            java.lang.String r2 = X.182.A04(r5, r4, r1)
            r17 = r15 ^ 1
            boolean r1 = X.AET.A02(r6, r14)
            r16 = r1 ^ 1
            boolean r15 = X.AET.A02(r6, r2)
            r14 = 0
            r2 = 0
        L_0x02ed:
            if (r2 >= r9) goto L_0x0303
            char r1 = r6.charAt(r2)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 == 0) goto L_0x0304
            int r2 = r2 + 1
            goto L_0x02ed
        L_0x02fc:
            android.net.Uri r10 = android.net.Uri.EMPTY
            goto L_0x0289
        L_0x02ff:
            java.lang.String r1 = "missing_app_id"
            goto L_0x031d
        L_0x0303:
            r14 = 1
        L_0x0304:
            r1 = r14 ^ 1
            if (r17 == 0) goto L_0x030a
            if (r16 != 0) goto L_0x033a
        L_0x030a:
            if (r15 != 0) goto L_0x033a
            if (r1 != 0) goto L_0x033a
            if (r16 == 0) goto L_0x0322
            if (r8 == 0) goto L_0x031a
            java.lang.String r1 = "com.instagram.android"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0322
        L_0x031a:
            java.lang.String r1 = "package_not_specified"
        L_0x031d:
            r3.A00(r1)
            goto L_0x0049
        L_0x0322:
            java.lang.String r2 = "image"
            r1 = 0
            boolean r1 = X.00p.A0k(r13, r2, r1)
            if (r1 == 0) goto L_0x033d
            r1 = 36318200505636853(0x810736000517f5, double:3.0311144691954546E-306)
            boolean r1 = X.182.A06(r5, r4, r1)
            if (r1 != 0) goto L_0x033d
            java.lang.String r1 = "type_not_supported"
            goto L_0x031d
        L_0x033a:
            java.lang.String r1 = "app_not_supported"
            goto L_0x031d
        L_0x033d:
            X.0qQ.A0K(r10, r7)
            java.lang.String r1 = "com.instagram.share.ADD_TO_REEL_MULTIPLE"
            boolean r1 = X.0qQ.A0K(r12, r1)
            java.lang.String r7 = "android.intent.extra.STREAM"
            if (r1 == 0) goto L_0x0355
            r1 = 36318200505636853(0x810736000517f5, double:3.0311144691954546E-306)
            boolean r1 = X.182.A06(r5, r4, r1)
            if (r1 != 0) goto L_0x0368
        L_0x0355:
            java.lang.String r1 = "com.instagram.share.ADD_AUTO_CAPTURE_TO_REEL_MULTIPLE"
            boolean r1 = X.0qQ.A0K(r12, r1)
            if (r1 == 0) goto L_0x039a
            r1 = 36320768896148308(0x81098c00062354, double:3.032738729696977E-306)
            boolean r1 = X.182.A06(r5, r4, r1)
            if (r1 == 0) goto L_0x039a
        L_0x0368:
            android.content.Intent r1 = r0.getIntent()
            java.util.ArrayList r17 = r1.getParcelableArrayListExtra(r7)
            if (r17 != 0) goto L_0x0374
            X.0sn r17 = X.0sn.A00
        L_0x0374:
            int r5 = r17.size()
            long r1 = r3.A01
            int r4 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r4 == 0) goto L_0x0386
            X.1QP r4 = r3.A02
            java.lang.String r3 = "media_count"
            r4.flowAnnotate(r1, r3, r5)
        L_0x0386:
            boolean r1 = r17.isEmpty()
            if (r1 != 0) goto L_0x0049
            java.lang.Integer r15 = X.AnonymousClass05K.A01
            X.JVH r3 = new X.JVH
            r12 = r3
            r13 = r11
            r14 = r10
            r16 = r6
            r12.<init>((android.net.Uri) r13, (android.net.Uri) r14, (java.lang.Integer) r15, (java.lang.String) r16, (java.util.List) r17)
            goto L_0x0128
        L_0x039a:
            android.content.Intent r1 = r0.getIntent()
            android.os.Parcelable r2 = r1.getParcelableExtra(r7)
            if (r2 == 0) goto L_0x03b1
            android.net.Uri r1 = android.net.Uri.EMPTY
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x03b1
            java.util.List r17 = X.AnonymousClass7TE.A1I(r2)
            goto L_0x0386
        L_0x03b1:
            java.lang.String r1 = "missing_video"
            r3.A00(r1)
            X.0sn r17 = X.0sn.A00
            goto L_0x0386
        L_0x03ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x03bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x03c4:
            X.8nf r1 = X.C365768ne.A0A
            X.8ne r5 = r1.A00()
            java.lang.String r1 = r3.A05
            r5.A06 = r1
            java.lang.Object r1 = r3.A01
            if (r1 == 0) goto L_0x03d6
            java.lang.String r2 = r1.toString()
        L_0x03d6:
            r5.A07 = r2
            X.08y r4 = X.09i.A0A
            X.0wW r9 = r4.A05(r0)
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r12 = r1.getType()
            java.lang.Object r3 = r3.A03
            android.net.Uri r3 = (android.net.Uri) r3
            android.content.Intent r2 = r0.getIntent()
            X.0qQ.A07(r2)
            X.0wW r1 = r4.A05(r0)
            X.Jvw r8 = X.C9853RiS.A00(r0, r2, r1)
            r13 = 0
            X.T8D r1 = new X.T8D
            r1.<init>(r5, r0)
            r10 = r1
            r11 = r7
            r14 = r13
            r15 = r6
            r6 = r0
            r7 = r3
            r5.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0409:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.handleractivity.BaseShareHandlerActivity.A00():void");
    }

    public final void A02(Exception exc) {
        String str;
        UserSession userSession;
        String str2;
        if (this instanceof ClipsShareHandlerActivity) {
            if (exc instanceof IOException) {
                str = "io_exception";
            } else if (exc instanceof SecurityException) {
                str = "internal_file";
            } else {
                str = "unknown";
            }
            userSession = A01();
            if (userSession == null) {
                return;
            }
        } else if (this instanceof ClipsMusicShareHandlerActivity) {
            if (exc instanceof IOException) {
                str2 = "io_exception";
            } else if (exc instanceof SecurityException) {
                str2 = "internal_file";
            } else {
                str2 = "unknown";
            }
            userSession = A01();
            if (userSession == null) {
                return;
            }
        } else {
            return;
        }
        C10993S4n A00 = C9851RiQ.A00(userSession);
        if (A00 != null) {
            A00.A00(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof com.instagram.share.handleractivity.ShareHandlerActivity
            if (r0 == 0) goto L_0x005e
            com.instagram.common.session.UserSession r4 = r5.A01()
            r0 = 0
            if (r4 == 0) goto L_0x002c
            java.lang.String r2 = X.Pxi.A0a(r5)
            java.lang.String r1 = "android.intent.action.SEND"
            boolean r2 = X.0qQ.A0K(r2, r1)
            android.content.Intent r1 = r5.getIntent()
            if (r2 == 0) goto L_0x0046
            java.lang.String r3 = r1.getType()
            r2 = 1
            if (r3 == 0) goto L_0x002d
            java.lang.String r1 = "video"
            boolean r1 = X.C66580MXl.A1a(r1, r2, r3)
            if (r1 != r2) goto L_0x002d
        L_0x002b:
            r0 = 1
        L_0x002c:
            return r0
        L_0x002d:
            X.0Tu r3 = X.0Tu.A05
            r1 = 36323912811818592(0x810c6800002e60, double:3.034726954626397E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 != 0) goto L_0x002b
            r1 = 36323912811949666(0x810c6800022e62, double:3.034726954709289E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x002c
            goto L_0x002b
        L_0x0046:
            java.lang.String r2 = r1.getAction()
            java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x002c
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323912812015203(0x810c6800032e63, double:3.0347269547507347E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            return r0
        L_0x005e:
            boolean r0 = r5 instanceof com.instagram.share.handleractivity.ReelShareHandlerActivity
            if (r0 != 0) goto L_0x002b
            boolean r0 = r5 instanceof com.instagram.share.handleractivity.ClipsThreadShareHandlerActivity
            if (r0 != 0) goto L_0x002b
            boolean r0 = r5 instanceof com.instagram.share.handleractivity.ClipsShareHandlerActivity
            if (r0 != 0) goto L_0x002b
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.handleractivity.BaseShareHandlerActivity.A04():boolean");
    }

    public final UserSession A01() {
        UserSession A0S = DbS.A0S(this);
        if (A0S instanceof UserSession) {
            return A0S;
        }
        return null;
    }

    public final void A03(boolean z) {
        Integer num;
        UserSession userSession;
        Intent intent = getIntent();
        int i = 0;
        if (!intent.getBooleanExtra("ShareHandlerActivity.IS_FROM_INSTAGRAM", false)) {
            i = 335544320;
        }
        Intent A03 = AnonymousClass14B.A03.A00().A03(this, i);
        if (!z) {
            if (this instanceof ShareHandlerActivity) {
                num = AnonymousClass05K.A0N;
            } else if (this instanceof ReelShareHandlerActivity) {
                num = AnonymousClass05K.A0Y;
            } else if (this instanceof ClipsThreadShareHandlerActivity) {
                num = AnonymousClass05K.A0C;
            } else if (this instanceof ClipsShareHandlerActivity) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            A03.putExtra(C9852RiR.A00(num), intent);
            if (!(this instanceof ClipsShareHandlerActivity) ? !(!(this instanceof ClipsMusicShareHandlerActivity) || (userSession = A01()) == null) : (userSession = A01()) != null) {
                C10993S4n A00 = C9851RiQ.A00(userSession);
                if (A00 != null) {
                    long j = A00.A01;
                    if (j != 0) {
                        A00.A02.flowEndSuccess(j);
                        A00.A01 = 0;
                    }
                }
            }
        }
        0kR.A0B(this, A03);
    }

    public void onCreate(Bundle bundle) {
        Integer num;
        UserSession A01;
        0Tu r2;
        long j;
        int A00 = AnonymousClass0fD.A00(-2139465065);
        18g A012 = C638918c.A01(C61170le.A00);
        boolean z = this instanceof ShareHandlerActivity;
        if (z) {
            num = AnonymousClass05K.A02;
        } else if (this instanceof ReelShareHandlerActivity) {
            num = AnonymousClass05K.A03;
        } else if (this instanceof ClipsThreadShareHandlerActivity) {
            num = AnonymousClass05K.A05;
        } else {
            num = AnonymousClass05K.A04;
        }
        A012.A0K(getIntent(), num);
        if (!(A01() == null || bundle == null || !bundle.getBoolean("async_app_init_recreate"))) {
            if (z) {
                A01 = A01();
                if (A01 != null) {
                    if (0qQ.A0K(Pxi.A0a(this), "android.intent.action.SEND")) {
                        r2 = 0Tu.A05;
                        j = 36323912812342885L;
                    } else if (0qQ.A0K(Pxi.A0a(this), "android.intent.action.SEND_MULTIPLE")) {
                        r2 = 0Tu.A05;
                        j = 36323912812408422L;
                    }
                }
            } else if (((this instanceof ReelShareHandlerActivity) || (this instanceof ClipsShareHandlerActivity)) && (A01 = A01()) != null) {
                r2 = 0Tu.A05;
                j = 36323912812473959L;
            }
            if (182.A06(r2, A01, j)) {
                bundle = null;
            }
        }
        super.onCreate(bundle);
        if (bundle == null) {
            A00();
        }
        C2594141p.A00(this, 1);
        0lU.A07(this);
        setContentView(R.layout.base_handler_activity);
        AnonymousClass0fD.A07(-4622978, A00);
    }

    public final void onDestroy() {
        int A00 = AnonymousClass0fD.A00(-2095995398);
        super.onDestroy();
        0lU.A08(this);
        AnonymousClass0fD.A07(-1857569707, A00);
    }
}
