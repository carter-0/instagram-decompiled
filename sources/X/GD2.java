package X;

import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.spotlight.fetch.SpotlightFetchRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class GD2 implements JRF {
    public static final float[] A07 = {0.25f, 0.5f, 0.75f};
    public GDB A00;
    public float A01;
    public final AnonymousClass4DH A02;
    public final ClipsViewerConfig A03;
    public final UserSession A04;
    public final GIN A05;
    public final C62320sa A06;

    public GD2(AnonymousClass4DH r2, ClipsViewerConfig clipsViewerConfig, UserSession userSession, GIN gin, C62320sa r6) {
        C51973G9u.A0r(1, userSession, gin, clipsViewerConfig);
        this.A04 = userSession;
        this.A02 = r2;
        this.A06 = r6;
        this.A05 = gin;
        this.A03 = clipsViewerConfig;
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void DaS(C267324bN r13, int i, int i2, boolean z) {
        List B02;
        EffectPreviewIntf effectPreviewIntf;
        String effectId;
        0qQ.A0B(r13, 0);
        1Xj r7 = r13.A02;
        if (r7 != null) {
            UserSession userSession = this.A04;
            GLN A002 = GLB.A00(MusicPageTabType.CLIPS, userSession);
            float f = (((float) i) * 1.0f) / ((float) i2);
            float[] fArr = A07;
            int i3 = 0;
            do {
                float f2 = fArr[i3];
                if (this.A01 <= f2 && f2 <= f) {
                    C67231sQ clipsMetadata = r7.A0C.getClipsMetadata();
                    AnonymousClass4DH r10 = this.A02;
                    A002.A01(clipsMetadata, userSession, "loop_playback_25_percent", r10.getModuleName());
                    CreativeConfigIntf AsO = r7.A0C.AsO();
                    if (!(AsO == null || (B02 = AsO.B02()) == null || (effectPreviewIntf = (EffectPreviewIntf) 00k.A0J(B02)) == null || (effectId = effectPreviewIntf.getEffectId()) == null)) {
                        GGQ.A00(userSession).A00(userSession, "loop_playback_25_percent", effectId, r10.getModuleName());
                    }
                }
                i3++;
            } while (i3 < 3);
            this.A01 = f;
        }
    }

    public final void Dxl(C267324bN r9, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
        C267324bN r3 = r9;
        C52058GDe gDe2 = gDe;
        C52019GBq gBq2 = gBq;
        C52078GDy gDy2 = gDy;
        C51974G9v.A1O(gDy, gBq, r9, gDe);
        UserSession userSession = this.A04;
        ((2AJ) userSession.A01(2AJ.class, AnonymousClass2AF.A00)).A00(r9.A0C());
        if (gDy.A02().A0N || z) {
            AnonymousClass2fL A002 = AnonymousClass2fL.A00(userSession);
            1Xj r0 = r9.A02;
            if (r0 != null) {
                A002.A0O(r0.A2n(), this.A03.A0m);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        gDy.A02().A0E = new GLE(r3, gDe2, gBq2, this, gDy2);
    }

    public final void Dxm(C267324bN r18, Integer num, int i) {
        1Xj r12;
        0Tu r2;
        LNK lnk;
        String moduleName;
        0h9 r10;
        long j;
        List list;
        C295415o7 r3;
        C267324bN r6 = r18;
        0qQ.A0B(r6, 0);
        UserSession userSession = this.A04;
        ((2AJ) userSession.A01(2AJ.class, AnonymousClass2AF.A00)).A00(r6.A0C());
        AnonymousClass2fL A002 = AnonymousClass2fL.A00(userSession);
        1Xj r0 = r6.A02;
        if (r0 != null) {
            String A2n = r0.A2n();
            ClipsViewerConfig clipsViewerConfig = this.A03;
            A002.A0O(A2n, clipsViewerConfig.A0m);
            String A0u = C51969G9p.A0u(r6.A02);
            ClipsViewerSource clipsViewerSource = clipsViewerConfig.A0J;
            if (clipsViewerSource == ClipsViewerSource.SPOTLIGHT && A0u != null) {
                SpotlightFetchRepository A003 = AnonymousClass4A7.A00(userSession);
                HashSet hashSet = A003.A04;
                boolean add = hashSet.add(A0u);
                C61063Jw1 jw1 = (C61063Jw1) A003.A05.getValue();
                if (add && jw1 != null) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    for (Object next : (List) jw1.A02) {
                        if (hashSet.contains(((C52088GEi) next).A04)) {
                            A1C.add(next);
                        } else {
                            A1C2.add(next);
                        }
                    }
                    SpotlightFetchRepository.A01(A003, A1C, A1C2);
                }
            }
            1Xj r7 = r6.A02;
            if (r7 != null) {
                int intValue = r6.A03.intValue();
                if (intValue == 2) {
                    r3 = C295415o7.PREFETCH_CACHE;
                } else if (intValue == 1) {
                    r3 = C295415o7.FLASH_CACHE;
                }
                C295395o5.A00(userSession).A00(r3, AnonymousClass05K.A00, AnonymousClass7TE.A1I(r7));
            }
            GDB gdb = this.A00;
            if (gdb != null) {
                gdb.A0E(false);
            }
            if (clipsViewerSource == ClipsViewerSource.BLEND) {
                GDM gdm = (GDM) this.A06.invoke();
                UserSession userSession2 = gdm.A03;
                if (GAW.A00(userSession2).booleanValue() && 182.A06(0Tu.A05, userSession2, 2342172642922217705L)) {
                    1Av A004 = 1Au.A00(userSession2);
                    if (A004.A01.getInt("blend_direct_inbox_nux_seen_count", 0) < 1 && 1Av.A07(A004, "blend_viewer_nux_last_shown_time_ms", 1) && !gdm.A00) {
                        gdm.A00 = true;
                        C58099ImL.A01(gdm, gdm.A04, 36);
                    }
                }
            }
            if (!C52076GDw.A03(r6) || (list = r6.A0R) == null) {
                r12 = r6.A02;
            } else {
                r12 = (1Xj) 00k.A0O(list, AnonymousClass7TG.A0A(num));
            }
            if (r12 != null) {
                C296815qg Beg = r12.A0C.Beg();
                if (Beg != null && AnonymousClass7TF.A1Y(Beg.BuK(), true)) {
                    r2 = 0Tu.A05;
                    if (182.A06(r2, userSession, 36318724491516317L)) {
                        lnk = LNK.A00;
                        AnonymousClass4DH r02 = this.A02;
                        moduleName = r02.getModuleName();
                        r10 = r02.mLifecycleRegistry;
                        0qQ.A07(r10);
                        j = 36600199468289781L;
                        lnk.A00(r10, userSession, r12, moduleName, i, 182.A01(r2, userSession, j));
                    }
                }
                r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36318724491319708L)) {
                    lnk = LNK.A00;
                    AnonymousClass4DH r03 = this.A02;
                    moduleName = r03.getModuleName();
                    r10 = r03.mLifecycleRegistry;
                    0qQ.A07(r10);
                    j = 36600199468093172L;
                    lnk.A00(r10, userSession, r12, moduleName, i, 182.A01(r2, userSession, j));
                }
            }
            GDB gdb2 = this.A00;
            if (gdb2 != null) {
                gdb2.A0D(false);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void Dzr(C267324bN r6, JRO jro, boolean z) {
        C67231sQ A0n;
        int i;
        0qQ.A0B(r6, 1);
        1Xj r1 = r6.A02;
        if (r1 != null && z && AnonymousClass3ZJ.A0D(this.A04, r1)) {
            GIN gin = this.A05;
            1Xj r0 = r6.A02;
            if (r0 != null && (A0n = C51966G9m.A0n(r0)) != null) {
                if (A0n.BZB() != null) {
                    i = 2131955282;
                } else if (A0n.BUr() != null) {
                    i = 2131955768;
                } else {
                    return;
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    C310346aq r2 = C310346aq.DEFAULT;
                    C310336ap A0a = DbS.A0a();
                    A0a.A0C = r2;
                    A0a.A0H = "";
                    DbS.A19(gin.A02, A0a, intValue);
                    A0a.A06();
                    DbY.A1N(A0a);
                }
            }
        }
    }

    public final void Dxi(C267324bN r3, int i) {
        GDB gdb = this.A00;
        if (gdb != null) {
            gdb.A0E(true);
        }
        GDB gdb2 = this.A00;
        if (gdb2 != null) {
            gdb2.A0D(true);
        }
    }

    public final void Dzs() {
        GDB gdb = this.A00;
        if (gdb != null) {
            gdb.A09();
        }
    }

    public final void DxZ(C267324bN r8, int i, int i2) {
        1Xj A0l = C51968G9o.A0l(r8);
        if (A0l != null) {
            UserSession userSession = this.A04;
            GLN A002 = GLB.A00(MusicPageTabType.CLIPS, userSession);
            C67231sQ A0n = C51966G9m.A0n(A0l);
            AnonymousClass4DH r2 = this.A02;
            A002.A01(A0n, userSession, "loop_playback_25_percent", r2.getModuleName());
            G9w.A1J(r2, userSession, A0l, "loop_playback_25_percent");
        }
    }

    public final void Dxg(C267324bN r1, int i) {
    }
}
