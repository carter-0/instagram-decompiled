package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3ov  reason: invalid class name and case insensitive filesystem */
public abstract class C252323ov {
    public final AnonymousClass4DU A00;
    public final String A01;

    public C263974Ob A06(C263974Ob r4, Object obj) {
        Integer num;
        String str;
        0qQ.A0B(r4, 1);
        String str2 = AnonymousClass1QI.A00.A02.A00;
        if (str2 != null) {
            r4.A06("nav_chain", str2);
        }
        String A02 = A02();
        if (A02 != null) {
            r4.A06("chaining_session_id", A02);
        }
        String A09 = A09();
        if (A09 != null) {
            r4.A06("viewer_session_id", A09);
        }
        C263844No A07 = A07(obj);
        if (A07 != null) {
            AnonymousClass3WR r2 = A07.A04;
            boolean z = A07.A0P;
            1iA r1 = A07.A02;
            if (z) {
                num = AnonymousClass05K.A01;
            } else if (r2 != null) {
                ProductType productType = r2.A09;
                if (productType == null || (str = productType.A00) == null) {
                    num = r2.A0E;
                }
                r4.A06("video_type", str);
            } else if (r1 == 1iA.A09 || r1 == 1iA.A0B) {
                num = AnonymousClass05K.A00;
            } else if (r1 == 1iA.A0L) {
                num = AnonymousClass05K.A0N;
            } else if (r1 == 1iA.A0Q) {
                num = AnonymousClass05K.A15;
            } else {
                str = "unknown";
                r4.A06("video_type", str);
            }
            str = AnonymousClass4O2.A00(num);
            r4.A06("video_type", str);
        }
        return r4;
    }

    public void A0A(0xI r1, C263934Nx r2) {
    }

    public boolean A0B(Object obj) {
        return false;
    }

    public final AnonymousClass4OR A01(UserSession userSession, 1Xj r10) {
        String str;
        AnonymousClass4OQ r7;
        AnonymousClass4DU r5 = this.A00;
        String str2 = null;
        if (AnonymousClass3WX.A02(r10, r5)) {
            r7 = AnonymousClass4OQ.PAID;
            str = C231122qu.A0F(userSession, r10);
        } else if (AnonymousClass3WX.A01(r10, r5)) {
            r7 = AnonymousClass4OQ.ORGANIC;
            str = r10.A0C.getOrganicTrackingToken();
        } else {
            if (r10.CUz()) {
                str = r10.A0C.BGe();
            } else {
                str = null;
            }
            r7 = AnonymousClass4OQ.ORGANIC;
        }
        String A03 = A03(r10);
        User A2A = r10.A1e(userSession).A2A(userSession);
        if (A2A != null) {
            str2 = A2A.getId();
        }
        0bb r6 = new 0bb();
        r6.A05("media_id", Long.valueOf(AnonymousClass4OT.A00.A01(A03)));
        r6.A01(r7, "tracking_type");
        r6.A06("current_watching_module", r5.getModuleName());
        r6.A06("tracking_token", str);
        r6.A06("author_id", str2);
        r6.A06("pre_processing_media_id", A03);
        return r6;
    }

    public final String A02() {
        if (this instanceof AnonymousClass4O0) {
            return ((AnonymousClass4O0) this).A05;
        }
        return null;
    }

    public final String A04(String str) {
        if (this instanceof C263914Nv) {
            0qQ.A0B(str, 0);
            if (((C263914Nv) this).A0H.Cau()) {
                return "cobroadcast_finish";
            }
            return str;
        }
        0qQ.A0B(str, 0);
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0113, code lost:
        if (r3 == null) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0115, code lost:
        r3 = "57320893950";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0117, code lost:
        r4 = new X.0bb();
        r4.A05("media_id", java.lang.Long.valueOf(r0));
        r4.A01(X.AnonymousClass4OQ.A03, "tracking_type");
        r4.A06("current_watching_module", r2.A00.getModuleName());
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0138, code lost:
        if (r5 == null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013a, code lost:
        r2 = (java.lang.String) r5.A06.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0142, code lost:
        r4.A06("tracking_token", r2);
        r4.A06("author_id", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014c, code lost:
        if (r5 == null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014e, code lost:
        r1 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0150, code lost:
        r0 = "pre_processing_media_id";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0156, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015a, code lost:
        if (r5 != null) goto L_0x0111;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass4OR A05(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C263914Nv
            if (r0 == 0) goto L_0x00d6
            r2 = r8
            X.4Nv r2 = (X.C263914Nv) r2
            X.3uh r9 = (X.C255773uh) r9
            r0 = 0
            X.0qQ.A0B(r9, r0)
            com.instagram.user.model.User r3 = r9.A0i
            if (r3 == 0) goto L_0x00ce
            boolean r0 = r9.A1Y()
            r7 = 0
            r5 = 0
            if (r0 == 0) goto L_0x0060
            X.4OR r4 = new X.4OR
            r4.<init>()
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "media_id"
            r4.A05(r0, r1)
            X.4OQ r1 = X.AnonymousClass4OQ.ORGANIC
            java.lang.String r0 = "tracking_type"
            r4.A01(r1, r0)
            X.4DU r0 = r2.A00
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "current_watching_module"
            r4.A06(r0, r1)
            java.lang.String r0 = "tracking_token"
            r4.A06(r0, r5)
            java.lang.String r1 = r3.getId()
            java.lang.String r0 = "author_id"
            r4.A06(r0, r1)
            java.lang.String r0 = "pre_processing_media_id"
            r4.A06(r0, r5)
        L_0x004e:
            java.lang.Boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0056
            boolean r7 = r0.booleanValue()
        L_0x0056:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "is_live_streaming"
            r4.A03(r0, r1)
            return r4
        L_0x0060:
            boolean r0 = r9.A17()
            if (r0 != 0) goto L_0x006e
            X.4gL r0 = r9.A0c
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = r0.A0Z
            if (r0 == 0) goto L_0x00b5
        L_0x006e:
            X.4gL r0 = r9.A0c
            if (r0 == 0) goto L_0x00b3
            java.lang.String r6 = r0.A0e
            r6.getClass()
            java.lang.String r5 = r0.A0h
        L_0x0079:
            X.4OR r4 = new X.4OR
            r4.<init>()
            X.4OU r0 = X.AnonymousClass4OT.A00
            long r0 = r0.A01(r6)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "media_id"
            r4.A05(r0, r1)
            X.4OQ r1 = X.AnonymousClass4OQ.ORGANIC
            java.lang.String r0 = "tracking_type"
            r4.A01(r1, r0)
            X.4DU r0 = r2.A00
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "current_watching_module"
            r4.A06(r0, r1)
            java.lang.String r0 = "tracking_token"
            r4.A06(r0, r5)
            java.lang.String r1 = r3.getId()
            java.lang.String r0 = "author_id"
            r4.A06(r0, r1)
            java.lang.String r0 = "pre_processing_media_id"
            r4.A06(r0, r6)
            goto L_0x004e
        L_0x00b3:
            r6 = r5
            goto L_0x0079
        L_0x00b5:
            X.3mL r1 = r9.A0e
            X.3mL r0 = X.C250963mL.BROADCAST_ARCHIVE
            if (r1 == r0) goto L_0x006e
            X.1Xj r1 = r9.A0b
            if (r1 != 0) goto L_0x00c0
            return r5
        L_0x00c0:
            com.instagram.common.session.UserSession r0 = r2.A0G
            X.4OR r4 = r2.A01(r0, r1)
            java.lang.String r1 = r3.getId()
            java.lang.String r0 = "author_id"
            goto L_0x0152
        L_0x00ce:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00d6:
            boolean r0 = r8 instanceof X.AnonymousClass4O0
            if (r0 == 0) goto L_0x00f0
            r2 = r8
            X.4O0 r2 = (X.AnonymousClass4O0) r2
            X.4bN r9 = (X.C267324bN) r9
            r0 = 0
            X.0qQ.A0B(r9, r0)
            X.1Xj r1 = r9.A02
            if (r1 != 0) goto L_0x00e9
            r4 = 0
            return r4
        L_0x00e9:
            com.instagram.common.session.UserSession r0 = r2.A03
            X.4OR r4 = r2.A01(r0, r1)
            return r4
        L_0x00f0:
            boolean r0 = r8 instanceof X.AnonymousClass2y2
            if (r0 == 0) goto L_0x015d
            r2 = r8
            X.2y2 r2 = (X.AnonymousClass2y2) r2
            X.0eK r0 = r2.A00
            java.lang.Object r5 = r0.get()
            com.instagram.music.common.model.MusicDataSource r5 = (com.instagram.music.common.model.MusicDataSource) r5
            if (r5 == 0) goto L_0x0158
            java.lang.String r1 = r5.A03
            if (r1 == 0) goto L_0x0158
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
            if (r0 == 0) goto L_0x0158
            long r0 = r0.longValue()
        L_0x0111:
            java.lang.String r3 = r5.A02
            if (r3 != 0) goto L_0x0117
        L_0x0115:
            java.lang.String r3 = "57320893950"
        L_0x0117:
            X.4OR r4 = new X.4OR
            r4.<init>()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "media_id"
            r4.A05(r0, r1)
            X.4OQ r1 = X.AnonymousClass4OQ.ORGANIC
            java.lang.String r0 = "tracking_type"
            r4.A01(r1, r0)
            X.4DU r0 = r2.A00
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "current_watching_module"
            r4.A06(r0, r1)
            r1 = 0
            if (r5 == 0) goto L_0x0156
            X.0eM r0 = r5.A06
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
        L_0x0142:
            java.lang.String r0 = "tracking_token"
            r4.A06(r0, r2)
            java.lang.String r0 = "author_id"
            r4.A06(r0, r3)
            if (r5 == 0) goto L_0x0150
            java.lang.String r1 = r5.A03
        L_0x0150:
            java.lang.String r0 = "pre_processing_media_id"
        L_0x0152:
            r4.A06(r0, r1)
            return r4
        L_0x0156:
            r2 = r1
            goto L_0x0142
        L_0x0158:
            r0 = 0
            if (r5 == 0) goto L_0x0115
            goto L_0x0111
        L_0x015d:
            r0 = r8
            X.3ou r0 = (X.C252313ou) r0
            X.1Xj r9 = (X.1Xj) r9
            X.4OR r4 = r0.A0C(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252323ov.A05(java.lang.Object):X.4OR");
    }

    public C263844No A07(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        long A03;
        C270194gL r2;
        String str7;
        String str8;
        String str9;
        String str10;
        Object obj2 = obj;
        if (this instanceof C252313ou) {
            C252313ou r1 = (C252313ou) this;
            1Xj r0 = (1Xj) obj2;
            0qQ.A0B(r0, 0);
            AnonymousClass4DU r4 = r1.A00;
            boolean z = true;
            boolean z2 = false;
            FollowStatus followStatus = null;
            if (AnonymousClass3WX.A02(r0, r4)) {
                str8 = C231122qu.A0F(r1.A00, r0);
                z = false;
                z2 = true;
            } else if (AnonymousClass3WX.A01(r0, r4)) {
                str8 = r0.A0C.getOrganicTrackingToken();
            } else {
                if (r0.CUz()) {
                    str8 = r0.A0C.BGe();
                } else {
                    str8 = null;
                }
                z = false;
            }
            UserSession userSession = r1.A00;
            User A2A = r0.A2A(userSession);
            1iA BR7 = r0.BR7();
            if (BR7 == 1iA.A09) {
                str9 = r1.A03(r0);
            } else {
                str9 = null;
            }
            String id = r0.getId();
            if (id != null) {
                AnonymousClass3QO A1t = r0.A1t();
                0qQ.A0B(A1t, 2);
                String id2 = r0.getId();
                if (A2A != null) {
                    str10 = A2A.getId();
                } else {
                    str10 = null;
                }
                if (A2A != null) {
                    followStatus = A2A.B6o();
                }
                return new C263844No(A1t, BR7, followStatus, C252313ou.A00(r0, r1), (Boolean) null, id, (String) null, id2, str8, str10, r0.A2b(), (String) null, (String) null, (String) null, r0.A0C.BIl(), (String) null, (String) null, (String) null, C231122qu.A0H(userSession, r0.getId()), str9, (List) null, r0.A1A(), false, z, z2, r0.A4Y(), r0.A4p());
            }
            throw new IllegalStateException("Required value was null.");
        } else if (this instanceof C263914Nv) {
            C263914Nv r12 = (C263914Nv) this;
            C255773uh r02 = (C255773uh) obj2;
            0qQ.A0B(r02, 0);
            boolean A1Y = r02.A1Y();
            boolean z3 = true;
            boolean z4 = false;
            String str11 = null;
            if (A1Y) {
                C270184gK r22 = r02.A0d;
                r22.getClass();
                String str12 = r22.A00.A3t;
                A03 = r02.A03();
                str4 = null;
                str11 = str12;
                str6 = null;
            } else if (r02.A17() || (!((r2 = r02.A0c) == null || r2.A0Z == null) || r02.A0e == C250963mL.BROADCAST_ARCHIVE)) {
                C270194gL r23 = r02.A0c;
                if (r23 != null) {
                    str4 = r23.A0e;
                    str4.getClass();
                    str5 = r23.A0h;
                } else {
                    str4 = null;
                    str5 = null;
                }
                A03 = r02.A03();
            } else if (r02.A1k()) {
                A03 = r02.A03();
                str6 = null;
                z3 = false;
                str4 = null;
            } else {
                1Xj r5 = r02.A0b;
                if (r5 != null) {
                    AnonymousClass4DU r42 = r12.A00;
                    if (AnonymousClass3WX.A02(r5, r42)) {
                        str6 = C231122qu.A06(r12.A0G, r02.A09());
                        z3 = false;
                        z4 = true;
                    } else if (AnonymousClass3WX.A01(r5, r42)) {
                        str6 = r5.A0C.getOrganicTrackingToken();
                    } else {
                        if (r5.CUz()) {
                            str6 = r5.A0C.BGe();
                        } else {
                            str6 = null;
                        }
                        z3 = false;
                    }
                    str4 = r5.getId();
                    A03 = r5.A1A();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            User user = r02.A0i;
            if (user != null) {
                String str13 = r02.A0j;
                0qQ.A07(str13);
                AnonymousClass3QO A0B = r02.A0B();
                0qQ.A07(A0B);
                String id3 = user.getId();
                FollowStatus B6o = user.B6o();
                boolean A0m = r02.A0m();
                1iA A0C = r02.A0C();
                AnonymousClass3WR A0M = r02.A0M(r12.A0G);
                ReelCTAIntf A0A = r02.A0A();
                if (A0A != null) {
                    str7 = AnonymousClass6MS.A00(A0A);
                } else {
                    str7 = null;
                }
                return new C263844No(A0B, A0C, B6o, A0M, (Boolean) null, str13, str11, str4, str6, id3, str7, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, r02.A0M, A03, A1Y, z3, z4, A0m, r02.A0s());
            }
            throw new IllegalStateException("Required value was null.");
        } else if (!(this instanceof AnonymousClass2y2)) {
            return ((AnonymousClass4O0) this).A0C((C267324bN) obj2);
        } else {
            MusicDataSource musicDataSource = (MusicDataSource) ((AnonymousClass2y2) this).A00.get();
            if (musicDataSource == null || (str = musicDataSource.A03) == null) {
                str = "null";
            }
            AnonymousClass3QO r6 = AnonymousClass3QO.DEFAULT;
            if (musicDataSource == null || (str2 = musicDataSource.A02) == null) {
                str2 = "57320893950";
            }
            1iA r7 = 1iA.A07;
            if (musicDataSource != null) {
                str3 = (String) musicDataSource.A06.getValue();
            } else {
                str3 = null;
            }
            return new C263844No(r6, r7, (FollowStatus) null, (AnonymousClass3WR) null, (Boolean) null, str, (String) null, str, str3, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, false, false, false, false, false);
        }
    }

    public Integer A08() {
        if (this instanceof C252313ou) {
            if (((C252313ou) this) instanceof C232802uT) {
                return AnonymousClass05K.A01;
            }
            return AnonymousClass05K.A05;
        } else if (this instanceof AnonymousClass2y2) {
            return AnonymousClass05K.A06;
        } else {
            if (this instanceof C263914Nv) {
                return AnonymousClass05K.A0C;
            }
            return AnonymousClass05K.A0N;
        }
    }

    public String A09() {
        if (this instanceof C263914Nv) {
            return ((C263914Nv) this).A0J;
        }
        if (this instanceof AnonymousClass4O0) {
            return ((AnonymousClass4O0) this).A06;
        }
        return this.A01;
    }

    public C252323ov(AnonymousClass4DU r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public String A03(1Xj r3) {
        String id = r3.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
