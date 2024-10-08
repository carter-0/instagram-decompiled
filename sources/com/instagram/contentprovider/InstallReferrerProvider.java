package com.instagram.contentprovider;

import X.08y;
import X.09i;
import X.0Aj;
import X.0Df;
import X.0Tu;
import X.0qQ;
import X.0wc;
import X.1AW;
import X.1vm;
import X.1vn;
import X.2IS;
import X.AnonymousClass000;
import X.AnonymousClass08W;
import X.AnonymousClass0Gt;
import X.AnonymousClass0kM;
import X.AnonymousClass1vS;
import X.AnonymousClass2IY;
import X.C266584Zq;
import X.C40116ASh;
import X.C45921DFb;
import X.C61170le;
import X.C66590MXw;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.secure.content.PublicContentDelegate;
import com.instagram.contentprovider.graphql.IGMIRContentProviderMutationResponseImpl;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public final class InstallReferrerProvider extends C66590MXw {

    public final class Impl extends PublicContentDelegate implements AnonymousClass08W {
        public int A00;
        public long A01;
        public 0wc A02;
        public Set A03;
        public final AnonymousClass0Gt A04;
        public final Map A05;
        public final UriMatcher A06 = new UriMatcher(-1);

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.util.HashSet} */
        /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.contentprovider.InstallReferrerProvider$Impl, java.lang.Object, X.4Zn] */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
            if ((java.lang.System.currentTimeMillis() - r0.A01) > 50000) goto L_0x008b;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0186  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x01a5  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0203  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.net.Uri A0R(android.net.Uri r27, android.content.ContentValues r28) {
            /*
                r26 = this;
                r13 = 0
                r17 = r27
                r0 = r17
                X.0qQ.A0B(r0, r13)
                r15 = 1
                r14 = r28
                X.0qQ.A0B(r14, r15)
                X.0Tu r9 = X.0Tu.A05
                r0 = 18304583679875871(0x4107ec00001b1f, double:1.8947555057051275E-307)
                boolean r0 = X.1AW.A06(r9, r0)
                if (r0 == 0) goto L_0x0043
                r0 = 18304583679941408(0x4107ec00011b20, double:1.894755505731031E-307)
                boolean r0 = X.1AW.A06(r9, r0)
                if (r0 == 0) goto L_0x0043
                r0 = r26
                android.content.UriMatcher r2 = r0.A06
                r1 = r17
                int r1 = r2.match(r1)
                if (r1 != r15) goto L_0x0043
                java.lang.String r19 = r17.getLastPathSegment()
                if (r19 != 0) goto L_0x0044
                r1 = -1
                java.lang.String r3 = "insert"
                java.lang.String r4 = "0"
                java.lang.String r5 = "appID is null"
            L_0x0040:
                r0.A01(r1, r3, r4, r5)
            L_0x0043:
                return r27
            L_0x0044:
                X.9Fc r16 = X.C375789Fb.A00()
                if (r16 != 0) goto L_0x0053
                r1 = -1
                java.lang.String r3 = "insert"
                java.lang.String r5 = "storage is null"
            L_0x0050:
                r4 = r19
                goto L_0x0040
            L_0x0053:
                X.MXw r1 = r0.A00
                r18 = r1
                android.content.Context r1 = r18.getContext()
                android.content.pm.PackageManager r2 = r1.getPackageManager()
                if (r2 != 0) goto L_0x0068
                r1 = -1
                java.lang.String r3 = "insert"
                java.lang.String r5 = "package manager is null"
                goto L_0x0050
            L_0x0068:
                int r1 = android.os.Binder.getCallingUid()
                java.lang.String r6 = r2.getNameForUid(r1)
                if (r6 != 0) goto L_0x0079
                r1 = -1
                java.lang.String r3 = "insert"
                java.lang.String r5 = "package name is null"
                goto L_0x0050
            L_0x0079:
                java.util.Set r3 = r0.A03
                if (r3 == 0) goto L_0x008b
                long r7 = java.lang.System.currentTimeMillis()
                long r1 = r0.A01
                long r7 = r7 - r1
                r4 = 50000(0xc350, double:2.47033E-319)
                int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r1 <= 0) goto L_0x00c1
            L_0x008b:
                r1 = 18867533633618344(0x4307ec000501a8, double:2.1172628916827873E-307)
                java.lang.String r2 = X.1AW.A04(r9, r1)
                java.lang.String r1 = ","
                java.lang.String[] r1 = new java.lang.String[]{r1}
                java.util.List r2 = X.00l.A0R(r2, r1, r13)
                int r1 = r2.size()
                java.util.HashSet r3 = new java.util.HashSet
                r3.<init>(r1)
                java.util.Iterator r2 = r2.iterator()
            L_0x00ab:
                boolean r1 = r2.hasNext()
                if (r1 == 0) goto L_0x00b9
                java.lang.Object r1 = r2.next()
                r3.add(r1)
                goto L_0x00ab
            L_0x00b9:
                r0.A03 = r3
                long r1 = java.lang.System.currentTimeMillis()
                r0.A01 = r1
            L_0x00c1:
                X.0qQ.A0A(r3)
                boolean r1 = X.00k.A0u(r3, r6)
                if (r1 == 0) goto L_0x00d1
                r1 = -1
                java.lang.String r3 = "insert"
                java.lang.String r5 = "package is blocked"
                goto L_0x0050
            L_0x00d1:
                java.util.Map r5 = r0.A05
                if (r5 == 0) goto L_0x00dd
                java.lang.Object r12 = r5.get(r6)
                X.RxB r12 = (X.C10732RxB) r12
                if (r12 != 0) goto L_0x0110
            L_0x00dd:
                r1 = 18586058656976773(0x4207ec00060f85, double:2.0060091987847333E-307)
                long r1 = X.1AW.A01(r9, r1)
                int r3 = (int) r1
                r0.A00 = r3
                r1 = 18586058656780163(0x4207ec00030f83, double:2.0060091987070227E-307)
                long r1 = X.1AW.A01(r9, r1)
                r3 = 18586058656714626(0x4207ec00020f82, double:2.006009198681119E-307)
                long r3 = X.1AW.A01(r9, r3)
                int r7 = (int) r3
                r10 = 0
                int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
                if (r3 <= 0) goto L_0x014d
                if (r7 <= 0) goto L_0x014d
                X.0Gt r3 = r0.A04
                X.RxB r12 = new X.RxB
                r12.<init>(r3, r7, r1)
                if (r5 == 0) goto L_0x0110
                r5.put(r6, r12)
            L_0x0110:
                monitor-enter(r12)
                X.0JP r1 = r12.A04     // Catch:{ all -> 0x014a }
                long r3 = r1.now()     // Catch:{ all -> 0x014a }
                long r1 = r12.A01     // Catch:{ all -> 0x014a }
                long r10 = r3 - r1
                r12.A01 = r3     // Catch:{ all -> 0x014a }
                double r7 = r12.A00     // Catch:{ all -> 0x014a }
                double r5 = (double) r10     // Catch:{ all -> 0x014a }
                int r1 = r12.A02     // Catch:{ all -> 0x014a }
                double r3 = (double) r1     // Catch:{ all -> 0x014a }
                long r10 = r12.A03     // Catch:{ all -> 0x014a }
                double r1 = (double) r10     // Catch:{ all -> 0x014a }
                double r10 = r3 / r1
                double r5 = r5 * r10
                double r7 = r7 + r5
                r12.A00 = r7     // Catch:{ all -> 0x014a }
                int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r1 <= 0) goto L_0x0133
                r12.A00 = r3     // Catch:{ all -> 0x014a }
                r7 = r3
            L_0x0133:
                r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r1 >= 0) goto L_0x0145
                r1 = 0
            L_0x013a:
                monitor-exit(r12)
                if (r1 != 0) goto L_0x014d
                r1 = -1
                java.lang.String r3 = "insert"
                java.lang.String r5 = "rate limit reached"
                goto L_0x0050
            L_0x0145:
                double r7 = r7 - r2
                r12.A00 = r7     // Catch:{ all -> 0x014a }
                r1 = 1
                goto L_0x013a
            L_0x014a:
                r0 = move-exception
                monitor-exit(r12)
                throw r0
            L_0x014d:
                java.lang.String r1 = "is_ct"
                java.lang.Boolean r1 = r14.getAsBoolean(r1)
                X.0qQ.A07(r1)
                boolean r21 = r1.booleanValue()
                java.lang.String r1 = "install_referrer"
                java.lang.String r3 = r14.getAsString(r1)
                X.0qQ.A07(r3)
                java.lang.String r1 = "actual_timestamp"
                java.lang.Long r1 = r14.getAsLong(r1)
                X.0qQ.A07(r1)
                long r4 = r1.longValue()
                r1 = 5108(0x13f4, float:7.158E-42)
                java.lang.String r1 = X.AnonymousClass000.A00(r1)
                java.lang.String r25 = r14.getAsString(r1)
                X.0qQ.A07(r25)
                java.lang.String r2 = "&deep_link_seperator&"
                r6 = 0
                boolean r1 = X.00l.A0d(r3, r2, r13)
                if (r1 == 0) goto L_0x0203
                java.lang.String[] r1 = new java.lang.String[]{r2}
                java.util.List r2 = X.00l.A0R(r3, r1, r13)
                java.lang.String[] r1 = new java.lang.String[r13]
                java.lang.Object[] r1 = r2.toArray(r1)
                java.lang.String[] r1 = (java.lang.String[]) r1
                r3 = r1[r13]
                r11 = r1[r15]
            L_0x019a:
                r1 = 18304583680400162(0x4107ec00081b22, double:1.894755505912355E-307)
                boolean r1 = X.1AW.A06(r9, r1)
                if (r1 == 0) goto L_0x01da
                X.2VO r1 = X.AnonymousClass2VO.A01
                r1.A01()
                X.08y r1 = X.09i.A0A
                X.0wW r2 = r1.A05(r0)
                if (r2 == 0) goto L_0x01f1
                boolean r1 = r2 instanceof com.instagram.common.session.UserSession
                if (r1 == 0) goto L_0x01f1
                com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
                r0 = 36316954965709532(0x810614000e12dc, double:3.03032678473003E-306)
                boolean r0 = X.182.A06(r9, r2, r0)
                if (r0 == 0) goto L_0x01da
                if (r21 == 0) goto L_0x01da
                android.content.Context r0 = r18.getContext()
                X.0qQ.A07(r0)
                X.215 r7 = X.213.A00(r0, r2)
                java.lang.String r12 = "an_ig"
                r8 = r6
                r9 = r25
                r10 = r19
                r7.A05(r8, r9, r10, r11, r12)
            L_0x01da:
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                long r23 = r0.toSeconds(r4)
                com.facebook.ppml.enigma.InstallReferrerEventV2 r1 = new com.facebook.ppml.enigma.InstallReferrerEventV2
                r20 = r15
                r22 = r3
                r18 = r1
                r18.<init>(r19, r20, r21, r22, r23, r25)
                r0 = r16
                r0.A02(r1, r6)
                return r27
            L_0x01f1:
                r8 = -1
                if (r2 != 0) goto L_0x0200
                java.lang.String r12 = "MainSession is null:"
            L_0x01f7:
                java.lang.String r10 = "insert"
                r7 = r0
                r11 = r19
                r7.A01(r8, r10, r11, r12)
                goto L_0x01da
            L_0x0200:
                java.lang.String r12 = "MainSession is not a UserSession"
                goto L_0x01f7
            L_0x0203:
                r11 = r6
                goto L_0x019a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.contentprovider.InstallReferrerProvider.Impl.A0R(android.net.Uri, android.content.ContentValues):android.net.Uri");
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [X.4Zn] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final com.facebook.ppml.enigma.InstallReferrerEventV2 A00(com.facebook.ppml.enigma.InstallReferrerEventV2 r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
            /*
                r21 = this;
                r0 = r21
                X.MXw r0 = r0.A00
                android.content.Context r7 = r0.getContext()
                r2 = r22
                if (r7 == 0) goto L_0x0097
                android.content.pm.PackageManager r0 = r7.getPackageManager()
                if (r0 == 0) goto L_0x0097
                android.content.pm.PackageManager r1 = r7.getPackageManager()
                r0 = 0
                r3 = r25
                android.content.pm.ProviderInfo r0 = r1.resolveContentProvider(r3, r0)
                if (r0 == 0) goto L_0x0097
                java.lang.String r1 = "content://"
                r0 = 47
                r14 = r23
                java.lang.String r0 = X.002.A0i(r1, r3, r14, r0)
                r10 = 0
                android.net.Uri r8 = X.0cp.A03(r0)
                X.0qQ.A07(r8)
                java.lang.String r3 = "install_referrer"
                r15 = 1
                java.lang.String r6 = "is_ct"
                java.lang.String r5 = "actual_timestamp"
                java.lang.String[] r11 = new java.lang.String[]{r3, r6, r5}
                java.lang.String r0 = "0"
                if (r22 == 0) goto L_0x0062
                int r0 = r2.activityType
                java.lang.String r4 = java.lang.String.valueOf(r0)
                long r0 = r2.timestamp
                java.lang.String r0 = java.lang.String.valueOf(r0)
            L_0x004c:
                r1 = r24
                java.lang.String[] r12 = new java.lang.String[]{r4, r0, r1}
                android.content.ContentResolver r7 = r7.getContentResolver()
                r13 = 749387912(0x2caac088, float:4.853066E-12)
                java.lang.String r9 = "is_ct = ? AND actual_timestamp = ? AND package_name = ?"
                android.database.Cursor r4 = X.0fM.A01(r7, r8, r9, r10, r11, r12, r13)
                if (r4 == 0) goto L_0x0097
                goto L_0x0064
            L_0x0062:
                r4 = r0
                goto L_0x004c
            L_0x0064:
                boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x008f }
                if (r0 != r15) goto L_0x0094
                int r3 = r4.getColumnIndex(r3)     // Catch:{ all -> 0x008f }
                int r1 = r4.getColumnIndex(r6)     // Catch:{ all -> 0x008f }
                int r0 = r4.getColumnIndex(r5)     // Catch:{ all -> 0x008f }
                java.lang.String r17 = r4.getString(r3)     // Catch:{ all -> 0x008f }
                int r16 = r4.getInt(r1)     // Catch:{ all -> 0x008f }
                long r18 = r4.getLong(r0)     // Catch:{ all -> 0x008f }
                if (r17 == 0) goto L_0x0094
                java.lang.String r20 = ""
                com.facebook.ppml.enigma.InstallReferrerEventV2 r13 = new com.facebook.ppml.enigma.InstallReferrerEventV2     // Catch:{ all -> 0x008f }
                r13.<init>(r14, r15, r16, r17, r18, r20)     // Catch:{ all -> 0x008f }
                r4.close()
                return r13
            L_0x008f:
                r0 = move-exception
                r4.close()
                throw r0
            L_0x0094:
                r4.close()
            L_0x0097:
                return r22
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.contentprovider.InstallReferrerProvider.Impl.A00(com.facebook.ppml.enigma.InstallReferrerEventV2, java.lang.String, java.lang.String, java.lang.String):com.facebook.ppml.enigma.InstallReferrerEventV2");
        }

        private final void A01(long j, String str, String str2, String str3) {
            String str4 = str3;
            0wc r1 = this.A02;
            String A002 = AnonymousClass000.A00(4468);
            0Aj A003 = r1.A00(r1.A00, A002);
            long j2 = j;
            String str5 = str;
            String str6 = str2;
            if (A003.isSampled()) {
                A003.AAJ("action", str5);
                A003.AAJ("asset_id", str6);
                A003.A9F("activity_type", Long.valueOf(j2));
                A003.AAJ("error", str4);
                A003.Cgf();
            }
            0Tu r2 = 0Tu.A05;
            if (1AW.A06(r2, 18304583680465699L)) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", AnonymousClass000.A00(962));
                    08y r0 = 09i.A0A;
                    r0.A03(this);
                    1vn A004 = 1vm.A00(r0.A02(bundle));
                    0Df A022 = GraphQlCallInput.A02.A02();
                    0Df.A00(A022, str5, "action");
                    0Df.A00(A022, Integer.valueOf((int) j2), "activity_type");
                    0Df.A00(A022, str6, "asset_id");
                    if (str3 == null) {
                        str4 = "";
                    }
                    0Df.A00(A022, str4, "error");
                    2IS r11 = new 2IS();
                    2IS r7 = new 2IS();
                    r11.A00.A02().A0E(A022, "mir_info");
                    AnonymousClass2IY r02 = PandoGraphQLRequest.Companion;
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGMIRContentProviderMutation", r11.getParamsCopy(), r7.getParamsCopy(), IGMIRContentProviderMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xig_log_ig_mir_content_provider_info", new ArrayList());
                    if (1AW.A06(r2, 18304583680662309L)) {
                        pandoGraphQLRequest.setRetryPolicy(1);
                        pandoGraphQLRequest.setNetworkTimeoutSeconds((int) 1AW.A01(r2, 18586058657304454L));
                    }
                    A004.ATL(new C40116ASh(this, str6, j2), C45921DFb.A00, pandoGraphQLRequest);
                } catch (Exception e) {
                    0wc r12 = this.A02;
                    0Aj A005 = r12.A00(r12.A00, A002);
                    if (A005.isSampled()) {
                        A005.AAJ("action", str5);
                        A005.AAJ("asset_id", str6);
                        A005.A9F("activity_type", Long.valueOf(j2));
                        A005.AAJ("error", e.getMessage());
                        A005.Cgf();
                    }
                }
            }
        }

        public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        public final int A0N(Uri uri, String str, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.contentprovider.InstallReferrerProvider$Impl, X.4Zn] */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0128, code lost:
            if (r5.timestamp > r6) goto L_0x012a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized android.database.Cursor A0Q(android.net.Uri r29, java.lang.String[] r30, java.lang.String r31, java.lang.String[] r32, java.lang.String r33) {
            /*
                r28 = this;
                r9 = r28
                monitor-enter(r9)
                r0 = 0
                r4 = r29
                X.0qQ.A0B(r4, r0)     // Catch:{ all -> 0x026d }
                r1 = 1
                r2 = r30
                X.0qQ.A0B(r2, r1)     // Catch:{ all -> 0x026d }
                r13 = 3
                java.lang.String r7 = "install_referrer"
                java.lang.String r6 = "is_ct"
                r11 = 2
                java.lang.String r5 = "actual_timestamp"
                java.lang.String[] r2 = new java.lang.String[]{r7, r6, r5}     // Catch:{ all -> 0x026d }
                android.database.MatrixCursor r14 = new android.database.MatrixCursor     // Catch:{ all -> 0x026d }
                r14.<init>(r2)     // Catch:{ all -> 0x026d }
                X.0Tu r8 = X.0Tu.A05     // Catch:{ all -> 0x026d }
                r2 = 18304583679875871(0x4107ec00001b1f, double:1.8947555057051275E-307)
                boolean r2 = X.1AW.A06(r8, r2)     // Catch:{ all -> 0x026d }
                java.lang.String r23 = "attempt_query"
                java.lang.String r24 = r4.toString()     // Catch:{ all -> 0x026d }
                X.0qQ.A07(r24)     // Catch:{ all -> 0x026d }
                r21 = -1
                r19 = 0
                r20 = r9
                r25 = r19
                r20.A01(r21, r23, r24, r25)     // Catch:{ all -> 0x026d }
                r4.toString()     // Catch:{ all -> 0x026d }
                if (r2 == 0) goto L_0x026b
                android.content.UriMatcher r2 = r9.A06     // Catch:{ all -> 0x026d }
                int r2 = r2.match(r4)     // Catch:{ all -> 0x026d }
                if (r2 != r1) goto L_0x026b
                java.lang.String r2 = r4.getLastPathSegment()     // Catch:{ all -> 0x026d }
                if (r2 != 0) goto L_0x005d
                java.lang.String r23 = "query"
                java.lang.String r24 = "0"
                java.lang.String r25 = "appID is null"
                r20.A01(r21, r23, r24, r25)     // Catch:{ all -> 0x026d }
                goto L_0x026b
            L_0x005d:
                X.9Fc r12 = X.C375789Fb.A00()     // Catch:{ all -> 0x026d }
                if (r12 != 0) goto L_0x006e
                java.lang.String r23 = "query"
                java.lang.String r25 = "storage is null"
                r24 = r2
                r20.A01(r21, r23, r24, r25)     // Catch:{ all -> 0x026d }
                goto L_0x026b
            L_0x006e:
                X.MXw r15 = r9.A00     // Catch:{ all -> 0x026d }
                android.content.Context r3 = r15.getContext()     // Catch:{ all -> 0x026d }
                android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch:{ all -> 0x026d }
                if (r4 != 0) goto L_0x0085
                java.lang.String r23 = "query"
                java.lang.String r25 = "package manager is null"
                r24 = r2
                r20.A01(r21, r23, r24, r25)     // Catch:{ all -> 0x026d }
                goto L_0x026b
            L_0x0085:
                int r3 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x026d }
                java.lang.String r10 = r4.getNameForUid(r3)     // Catch:{ all -> 0x026d }
                if (r10 != 0) goto L_0x009a
                java.lang.String r23 = "query"
                java.lang.String r25 = "package name is null"
                r24 = r2
                r20.A01(r21, r23, r24, r25)     // Catch:{ all -> 0x026d }
                goto L_0x026b
            L_0x009a:
                r3 = 18304583680334625(0x4107ec00071b21, double:1.894755505886451E-307)
                X.1AW.A06(r8, r3)     // Catch:{ all -> 0x026d }
                boolean r16 = X.1AW.A06(r8, r3)     // Catch:{ all -> 0x026d }
                r4 = r31
                r3 = r32
                if (r16 == 0) goto L_0x014e
                if (r31 == 0) goto L_0x00f6
                int r5 = r4.length()     // Catch:{ all -> 0x026d }
                if (r5 == 0) goto L_0x00f6
                java.lang.String r5 = "is_ct = ? AND actual_timestamp = ? AND package_name = ?"
                boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x026d }
                if (r4 == 0) goto L_0x026b
                if (r32 == 0) goto L_0x026b
                int r4 = r3.length     // Catch:{ all -> 0x026d }
                if (r4 != r13) goto L_0x026b
                r4 = r32[r0]     // Catch:{ all -> 0x026d }
                X.0qQ.A0B(r4, r0)     // Catch:{ all -> 0x026d }
                java.lang.Integer r4 = X.00y.A0l(r4)     // Catch:{ all -> 0x026d }
                if (r4 == 0) goto L_0x00f1
                int r4 = r4.intValue()     // Catch:{ all -> 0x026d }
            L_0x00d0:
                r1 = r32[r1]     // Catch:{ all -> 0x026d }
                X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x026d }
                r0 = 10
                java.lang.Long r0 = X.00y.A0n(r0, r1)     // Catch:{ all -> 0x026d }
                if (r0 == 0) goto L_0x00ee
                long r6 = r0.longValue()     // Catch:{ all -> 0x026d }
            L_0x00e1:
                r0 = r32[r11]     // Catch:{ all -> 0x026d }
                com.facebook.ppml.enigma.InstallReferrerEventV2 r5 = r12.A01(r2, r0)     // Catch:{ all -> 0x026d }
                if (r5 == 0) goto L_0x026b
                int r0 = r5.activityType     // Catch:{ all -> 0x026d }
                if (r0 > r4) goto L_0x012a
                goto L_0x00f3
            L_0x00ee:
                r6 = 0
                goto L_0x00e1
            L_0x00f1:
                r4 = 0
                goto L_0x00d0
            L_0x00f3:
                if (r0 != r4) goto L_0x026b
                goto L_0x0124
            L_0x00f6:
                com.facebook.ppml.enigma.InstallReferrerEventV2 r4 = r12.A01(r2, r10)     // Catch:{ all -> 0x026d }
                android.content.Context r1 = r15.getContext()     // Catch:{ all -> 0x026d }
                android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch:{ all -> 0x026d }
                java.lang.String r1 = "com.facebook.katana.provider.InstallReferrerProvider"
                android.content.pm.ProviderInfo r0 = r3.resolveContentProvider(r1, r0)     // Catch:{ all -> 0x026d }
                if (r0 != 0) goto L_0x010c
                java.lang.String r1 = "com.facebook.wakizashi.provider.InstallReferrerProvider"
            L_0x010c:
                com.facebook.ppml.enigma.InstallReferrerEventV2 r5 = r9.A00(r4, r2, r10, r1)     // Catch:{ all -> 0x026d }
                r0 = 18304583680531236(0x4107ec000a1b24, double:1.894755505964162E-307)
                boolean r0 = X.1AW.A06(r8, r0)     // Catch:{ all -> 0x026d }
                if (r0 == 0) goto L_0x0121
                java.lang.String r0 = "com.facebook.lite.provider.InstallReferrerProvider"
                com.facebook.ppml.enigma.InstallReferrerEventV2 r5 = r9.A00(r5, r2, r10, r0)     // Catch:{ all -> 0x026d }
            L_0x0121:
                if (r5 == 0) goto L_0x026b
                goto L_0x012a
            L_0x0124:
                long r0 = r5.timestamp     // Catch:{ all -> 0x026d }
                int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r3 <= 0) goto L_0x026b
            L_0x012a:
                java.lang.String r4 = r5.installReferrer     // Catch:{ all -> 0x026d }
                int r0 = r5.activityType     // Catch:{ all -> 0x026d }
                java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x026d }
                long r0 = r5.timestamp     // Catch:{ all -> 0x026d }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x026d }
                java.lang.String[] r0 = new java.lang.String[]{r4, r3, r0}     // Catch:{ all -> 0x026d }
                r14.addRow(r0)     // Catch:{ all -> 0x026d }
                int r0 = r5.activityType     // Catch:{ all -> 0x026d }
                long r0 = (long) r0     // Catch:{ all -> 0x026d }
                java.lang.String r6 = "query"
                r3 = r9
                r4 = r0
                r7 = r2
                r8 = r19
                r3.A01(r4, r6, r7, r8)     // Catch:{ all -> 0x026d }
                goto L_0x026b
            L_0x014e:
                if (r31 == 0) goto L_0x0197
                int r8 = r4.length()     // Catch:{ all -> 0x026d }
                if (r8 == 0) goto L_0x0197
                java.lang.String r5 = "is_ct = ? AND actual_timestamp = ?"
                boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x026d }
                if (r4 == 0) goto L_0x026b
                if (r32 == 0) goto L_0x026b
                int r4 = r3.length     // Catch:{ all -> 0x026d }
                if (r4 < r11) goto L_0x026b
                r4 = r32[r0]     // Catch:{ all -> 0x026d }
                X.0qQ.A0B(r4, r0)     // Catch:{ all -> 0x026d }
                java.lang.Integer r4 = X.00y.A0l(r4)     // Catch:{ all -> 0x026d }
                if (r4 == 0) goto L_0x0191
                int r4 = r4.intValue()     // Catch:{ all -> 0x026d }
            L_0x0172:
                r5 = r32[r1]     // Catch:{ all -> 0x026d }
                X.0qQ.A0B(r5, r0)     // Catch:{ all -> 0x026d }
                r3 = 10
                java.lang.Long r3 = X.00y.A0n(r3, r5)     // Catch:{ all -> 0x026d }
                if (r3 == 0) goto L_0x018e
                long r15 = r3.longValue()     // Catch:{ all -> 0x026d }
            L_0x0183:
                com.facebook.ppml.enigma.InstallReferrerEventV2 r3 = r12.A01(r2, r10)     // Catch:{ all -> 0x026d }
                if (r3 == 0) goto L_0x026b
                int r7 = r3.activityType     // Catch:{ all -> 0x026d }
                if (r7 > r4) goto L_0x0247
                goto L_0x0193
            L_0x018e:
                r15 = 0
                goto L_0x0183
            L_0x0191:
                r4 = 0
                goto L_0x0172
            L_0x0193:
                if (r7 != r4) goto L_0x026b
                goto L_0x0241
            L_0x0197:
                com.facebook.ppml.enigma.InstallReferrerEventV2 r3 = r12.A01(r2, r10)     // Catch:{ all -> 0x026d }
                android.content.Context r12 = r15.getContext()     // Catch:{ all -> 0x026d }
                if (r12 == 0) goto L_0x0236
                android.content.pm.PackageManager r4 = r12.getPackageManager()     // Catch:{ all -> 0x026d }
                if (r4 == 0) goto L_0x0236
                android.content.pm.PackageManager r4 = r12.getPackageManager()     // Catch:{ all -> 0x026d }
                java.lang.String r10 = "com.facebook.katana.provider.InstallReferrerProvider"
                android.content.pm.ProviderInfo r4 = r4.resolveContentProvider(r10, r0)     // Catch:{ all -> 0x026d }
                java.lang.String r8 = "com.facebook.wakizashi.provider.InstallReferrerProvider"
                if (r4 != 0) goto L_0x01bf
                android.content.pm.PackageManager r4 = r12.getPackageManager()     // Catch:{ all -> 0x026d }
                android.content.pm.ProviderInfo r4 = r4.resolveContentProvider(r8, r0)     // Catch:{ all -> 0x026d }
                if (r4 == 0) goto L_0x0236
            L_0x01bf:
                android.content.pm.PackageManager r4 = r12.getPackageManager()     // Catch:{ all -> 0x026d }
                android.content.pm.ProviderInfo r4 = r4.resolveContentProvider(r10, r0)     // Catch:{ all -> 0x026d }
                if (r4 != 0) goto L_0x01ca
                r10 = r8
            L_0x01ca:
                java.lang.String r8 = "content://"
                r4 = 47
                java.lang.String r4 = X.002.A0i(r8, r10, r2, r4)     // Catch:{ all -> 0x026d }
                android.net.Uri r17 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x026d }
                java.lang.String[] r20 = new java.lang.String[]{r7, r6, r5}     // Catch:{ all -> 0x026d }
                java.lang.String r8 = "0"
                if (r3 == 0) goto L_0x01fe
                int r4 = r3.activityType     // Catch:{ all -> 0x026d }
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x026d }
                long r15 = r3.timestamp     // Catch:{ all -> 0x026d }
                java.lang.String r8 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x026d }
            L_0x01ea:
                java.lang.String[] r21 = new java.lang.String[]{r4, r8}     // Catch:{ all -> 0x026d }
                android.content.ContentResolver r16 = r12.getContentResolver()     // Catch:{ all -> 0x026d }
                r22 = -582042820(0xffffffffdd4ebb3c, float:-9.3103539E17)
                java.lang.String r18 = "is_ct = ? AND actual_timestamp = ?"
                android.database.Cursor r4 = X.0fM.A01(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x026d }
                if (r4 == 0) goto L_0x0236
                goto L_0x0200
            L_0x01fe:
                r4 = r8
                goto L_0x01ea
            L_0x0200:
                boolean r8 = r4.moveToFirst()     // Catch:{ all -> 0x0231 }
                if (r8 != r1) goto L_0x022d
                int r7 = r4.getColumnIndex(r7)     // Catch:{ all -> 0x0231 }
                int r6 = r4.getColumnIndex(r6)     // Catch:{ all -> 0x0231 }
                int r5 = r4.getColumnIndex(r5)     // Catch:{ all -> 0x0231 }
                java.lang.String r24 = r4.getString(r7)     // Catch:{ all -> 0x0231 }
                int r23 = r4.getInt(r6)     // Catch:{ all -> 0x0231 }
                long r25 = r4.getLong(r5)     // Catch:{ all -> 0x0231 }
                if (r24 == 0) goto L_0x022d
                java.lang.String r27 = ""
                com.facebook.ppml.enigma.InstallReferrerEventV2 r3 = new com.facebook.ppml.enigma.InstallReferrerEventV2     // Catch:{ all -> 0x0231 }
                r20 = r3
                r21 = r2
                r22 = r1
                r20.<init>(r21, r22, r23, r24, r25, r27)     // Catch:{ all -> 0x0231 }
            L_0x022d:
                r4.close()     // Catch:{ all -> 0x026d }
                goto L_0x0236
            L_0x0231:
                r0 = move-exception
                r4.close()     // Catch:{ all -> 0x026d }
                throw r0     // Catch:{ all -> 0x026d }
            L_0x0236:
                if (r3 == 0) goto L_0x026b
                java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ all -> 0x026d }
                java.lang.String r4 = r3.installReferrer     // Catch:{ all -> 0x026d }
                r5[r0] = r4     // Catch:{ all -> 0x026d }
                int r7 = r3.activityType     // Catch:{ all -> 0x026d }
                goto L_0x024d
            L_0x0241:
                long r4 = r3.timestamp     // Catch:{ all -> 0x026d }
                int r6 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r6 <= 0) goto L_0x026b
            L_0x0247:
                java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ all -> 0x026d }
                java.lang.String r4 = r3.installReferrer     // Catch:{ all -> 0x026d }
                r5[r0] = r4     // Catch:{ all -> 0x026d }
            L_0x024d:
                java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x026d }
                r5[r1] = r0     // Catch:{ all -> 0x026d }
                long r0 = r3.timestamp     // Catch:{ all -> 0x026d }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x026d }
                r5[r11] = r0     // Catch:{ all -> 0x026d }
                r14.addRow(r5)     // Catch:{ all -> 0x026d }
                int r0 = r3.activityType     // Catch:{ all -> 0x026d }
                long r0 = (long) r0     // Catch:{ all -> 0x026d }
                java.lang.String r6 = "query"
                r3 = r9
                r4 = r0
                r7 = r2
                r8 = r19
                r3.A01(r4, r6, r7, r8)     // Catch:{ all -> 0x026d }
            L_0x026b:
                monitor-exit(r9)
                return r14
            L_0x026d:
                r0 = move-exception
                monitor-exit(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.contentprovider.InstallReferrerProvider.Impl.A0Q(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
        }

        public final String A0T(Uri uri) {
            throw new UnsupportedOperationException();
        }

        public final void A0U() {
            this.A06.addURI("com.instagram.contentprovider.InstallReferrerProvider", "#", 1);
            this.A02 = new AnonymousClass0kM(C61170le.A00).A00();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Impl(C66590MXw mXw) {
            super(mXw);
            0qQ.A0A(mXw);
            AnonymousClass0Gt r0 = AnonymousClass0Gt.A00;
            0qQ.A07(r0);
            this.A04 = r0;
            this.A00 = 10;
            this.A05 = new C266584Zq(this);
        }
    }
}
