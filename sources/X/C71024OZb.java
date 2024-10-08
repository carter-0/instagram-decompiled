package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.spotify.sdk.android.auth.AuthorizationRequest;
import com.spotify.sdk.android.auth.LoginActivity;
import java.util.HashMap;

/* renamed from: X.OZb  reason: case insensitive filesystem */
public final class C71024OZb {
    public static final ImmutableList A01;
    public final 1vn A00;

    public C71024OZb(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = 1vm.A01(userSession);
    }

    public static final void A00(Activity activity, UserSession userSession) {
        AnonymousClass7TF.A1H(activity, userSession);
        0Tu r2 = 0Tu.A05;
        String A04 = 182.A04(r2, userSession, 36889250767700806L);
        String A042 = 182.A04(r2, userSession, 36889250767307588L);
        HashMap A1E = AnonymousClass7TE.A1E();
        if (A04.length() != 0) {
            AuthorizationRequest authorizationRequest = new AuthorizationRequest(A042, A04, A1E, DbU.A1b(A01, 0));
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putParcelable("request", authorizationRequest);
            Intent A0A = C66580MXl.A0A(activity, LoginActivity.class);
            A0A.putExtra("EXTRA_AUTH_REQUEST", A0a);
            A0A.addFlags(67108864);
            activity.startActivityForResult(A0A, 1361);
            return;
        }
        throw AnonymousClass7TE.A0w("Redirect URI can't be null or empty");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.app.Activity r19, android.content.Intent r20, X.C74382Ptx r21, com.instagram.common.session.UserSession r22, int r23) {
        /*
            r18 = this;
            r14 = 0
            r1 = r19
            X.0qQ.A0B(r1, r14)
            r0 = r21
            r5 = r22
            X.C51972G9s.A1B(r5, r0)
            r2 = -1
            r3 = r23
            if (r3 != r2) goto L_0x005b
            r6 = r20
            if (r20 == 0) goto L_0x005b
            java.lang.String r4 = "EXTRA_AUTH_RESPONSE"
            android.os.Bundle r2 = r6.getBundleExtra(r4)
            if (r2 == 0) goto L_0x005b
            java.lang.String r3 = "response"
            android.os.Parcelable r2 = r2.getParcelable(r3)
            if (r2 == 0) goto L_0x005b
            r8 = 0
            android.os.Bundle r2 = r6.getBundleExtra(r4)
            if (r2 == 0) goto L_0x0033
            android.os.Parcelable r8 = r2.getParcelable(r3)
            com.spotify.sdk.android.auth.AuthorizationResponse r8 = (com.spotify.sdk.android.auth.AuthorizationResponse) r8
        L_0x0033:
            X.0qQ.A07(r8)
            X.0Tu r4 = X.0Tu.A05
            r2 = 36889250767700806(0x830e94000a0346, double:3.392248954359538E-306)
            java.lang.String r7 = X.182.A04(r4, r5, r2)
            java.lang.Integer r2 = r8.A00
            if (r2 == 0) goto L_0x005a
            int r3 = r2.intValue()
            if (r3 == r14) goto L_0x006b
            r2 = 2
            if (r3 != r2) goto L_0x005a
            java.lang.String r3 = r8.A02
            if (r3 == 0) goto L_0x0067
            java.lang.String r2 = "AUTHENTICATION_DENIED_BY_USER"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0067
        L_0x005a:
            return
        L_0x005b:
            r10 = 0
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            com.spotify.sdk.android.auth.AuthorizationResponse r8 = new com.spotify.sdk.android.auth.AuthorizationResponse
            r11 = r10
            r12 = r10
            r13 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14)
            goto L_0x0033
        L_0x0067:
            r0.DCc(r1)
            return
        L_0x006b:
            X.1vn r3 = X.1vm.A01(r5)
            java.lang.String r4 = r8.A01
            X.0qQ.A07(r4)
            r12 = 1
            r13 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r2 = "auth_code"
            r6.A04(r2, r4)
            com.google.common.collect.ImmutableList r4 = A01
            java.lang.String r2 = "incremental_scopes"
            r6.A05(r2, r4)
            r2 = 849(0x351, float:1.19E-42)
            java.lang.String r2 = X.Pxd.A00(r2)
            X.1vR r7 = X.DbU.A0J(r6, r2, r7)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.Bcv> r11 = X.C42476Bcv.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "AddSpotifyAccountLinkMutation"
            java.lang.String r16 = "xdt_music_api_upsert_spotify_account_link"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2 = 6
            X.OnG r5 = new X.OnG
            r5.<init>(r2, r1, r0)
            r4 = 2
            X.Omr r2 = new X.Omr
            r2.<init>(r4, r1, r0)
            r3.ATL(r2, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71024OZb.A01(android.app.Activity, android.content.Intent, X.Ptx, com.instagram.common.session.UserSession, int):void");
    }

    public final void A02(Activity activity, C74439Puu puu, String str, String str2) {
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        A04.A04("audio_cluster_id", str);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(DbU.A0J(A04, "note_id", str2), "SaveSongToSpotifyMutation", A04.getParamsCopy(), A042.getParamsCopy(), C42478Bcx.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_music_api_save_song_to_spotify", AnonymousClass7TE.A1C());
        Activity activity2 = activity;
        C74439Puu puu2 = puu;
        this.A00.ATL(new C71556Omr(3, puu2, activity2), new C71579OnG(7, puu2, activity2), pandoGraphQLRequest);
    }

    static {
        ImmutableList of = ImmutableList.of("user-library-modify", "user-read-recently-played", "user-personalized", "user-library-read", "user-personalized", "user-read-currently-playing");
        0qQ.A07(of);
        A01 = of;
    }
}
