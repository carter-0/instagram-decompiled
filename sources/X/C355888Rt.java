package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.8Rt  reason: invalid class name and case insensitive filesystem */
public final class C355888Rt implements AnonymousClass2gO {
    public final /* synthetic */ ClipsTimelineEditorDrawerController A00;

    public C355888Rt(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A00 = clipsTimelineEditorDrawerController;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass8RM r0;
        C19140WMw wMw;
        AnonymousClass80U r1;
        Object obj2;
        AnonymousClass8BN r3;
        C391959tx r2;
        C359318cb r02;
        int i;
        C359318cb r03;
        MQQ mqq = (MQQ) obj;
        0qQ.A0B(mqq, 0);
        ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = this.A00;
        int i2 = 0;
        if (!AnonymousClass9IF.A00(1, mqq)) {
            0eP r10 = null;
            if (mqq.equals(C40395AbS.A00)) {
                ClipsTimelineEditorDrawerController.A06(clipsTimelineEditorDrawerController);
            } else if (mqq instanceof C65087Ln8) {
                AnonymousClass80U r5 = clipsTimelineEditorDrawerController.A0e;
                if (r5.CQ0(AnonymousClass80V.CLIPS_EDITOR)) {
                    if (clipsTimelineEditorDrawerController.A0d.A01.A04() != null) {
                        ClipsTimelineEditorDrawerController.A06(clipsTimelineEditorDrawerController);
                        AnonymousClass8A2 A01 = AnonymousClass8A1.A01(clipsTimelineEditorDrawerController.A0a);
                        28D r7 = clipsTimelineEditorDrawerController.A0c.A01;
                        AnonymousClass831 r04 = clipsTimelineEditorDrawerController.A0A;
                        if (r04 == null) {
                            0qQ.A0F("segmentStore");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        int size = r04.A01.size();
                        AE4 A012 = A01.A0J.A01("stackedtimeline", 838614012);
                        String name = r7.name();
                        0qQ.A0B(name, 1);
                        A012.A04.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, name);
                        A012.A05("num_segments", size);
                        A01.A07 = A012.A01();
                        r5.E3H(new Object());
                        AnonymousClass0eM r32 = clipsTimelineEditorDrawerController.A10;
                        ((AnonymousClass6ST) r32.getValue()).A00(clipsTimelineEditorDrawerController.A0W.getString(2131969783));
                        AnonymousClass0fN.A00((Dialog) r32.getValue());
                        return;
                    }
                    0kD.A07(AnonymousClass000.A00(425), "Attempting to open sharesheet with no active captured video.", (Throwable) null);
                    C64169LRs.A02(clipsTimelineEditorDrawerController.A0W, AnonymousClass05K.A1I, "Capture session has no active captured media when navigating to share sheet", 2131974093);
                    return;
                } else if (r5.CQ0(AnonymousClass80V.MEDIA_EDIT) && (r03 = (C359318cb) clipsTimelineEditorDrawerController.A0w.get()) != null) {
                    r03.A0J();
                    return;
                } else {
                    return;
                }
            } else if (mqq instanceof C65076Lmw) {
                AnonymousClass863 r05 = (AnonymousClass863) clipsTimelineEditorDrawerController.A0t.A0G.A02();
                if (r05 != null) {
                    i = r05.CEG();
                } else {
                    i = 0;
                }
                ClipsCreationViewModel clipsCreationViewModel = clipsTimelineEditorDrawerController.A0j;
                if (ClipsCreationViewModel.A00(clipsCreationViewModel).A00 - i > 90000) {
                    i2 = i + 90000;
                }
                if (clipsCreationViewModel.A0n()) {
                    r10 = new 0eP(Integer.valueOf(i), Integer.valueOf(i2));
                }
                27p.A01(clipsTimelineEditorDrawerController.A0a).A03.A07("clips_stacked_timeline_audio_button");
                ClipsTimelineEditorDrawerController.A05(C3515589i.TIMELINE_TOOLBAR_AUDIO_OPTION, clipsTimelineEditorDrawerController, (String) null, r10, false, false, false);
                return;
            } else if (mqq instanceof C65077Lmx) {
                ClipsTimelineEditorDrawerController.A05(C3515589i.TIMELINE_AUDIO_GHOST_TRACK, clipsTimelineEditorDrawerController, (String) null, (0eP) null, true, false, false);
                return;
            } else if (mqq instanceof C381969cs) {
                27p.A01(clipsTimelineEditorDrawerController.A0a).A03.A07("clips_stacked_timeline_audio_replace_button");
                ClipsTimelineEditorDrawerController.A05(C3515589i.TIMELINE_AUDIO_REPLACE, clipsTimelineEditorDrawerController, ((C381969cs) mqq).A01, (0eP) null, false, false, false);
                return;
            } else if (mqq instanceof C65086Ln7) {
                ClipsTimelineEditorDrawerController.A05(C3515589i.TIMELINE_TOOLBAR_AUDIO_OPTION, clipsTimelineEditorDrawerController, (String) null, (0eP) null, false, true, false);
                return;
            } else {
                if (mqq instanceof C65082Ln2) {
                    r0 = AnonymousClass8RM.A0C;
                } else if (mqq instanceof C65078Lmy) {
                    if (clipsTimelineEditorDrawerController.A0j.A0l()) {
                        clipsTimelineEditorDrawerController.A0r.A00(C59725JVj.POST_CAPTURE, clipsTimelineEditorDrawerController.A0b, (C273414mX) null, (Integer) null, true);
                        return;
                    }
                } else if (mqq.equals(C40398AbV.A00)) {
                    AnonymousClass8RH A0E = clipsTimelineEditorDrawerController.A0o.A0E();
                    if (A0E instanceof KM2) {
                        ClipsTimelineEditorDrawerController.A06(clipsTimelineEditorDrawerController);
                        clipsTimelineEditorDrawerController.A0m.A0A = Integer.valueOf(((KM2) A0E).A00);
                    } else {
                        return;
                    }
                } else {
                    if (mqq.equals(C40399AbW.A00)) {
                        r1 = clipsTimelineEditorDrawerController.A0e;
                        obj2 = new Object();
                    } else if ((mqq instanceof C65080Ln0) || (mqq instanceof C65081Ln1) || AnonymousClass9IF.A00(0, mqq) || (mqq instanceof C65079Lmz) || AnonymousClass9IF.A00(4, mqq) || AnonymousClass9IF.A00(3, mqq) || (mqq instanceof C40397AbU)) {
                        FrameLayout frameLayout = clipsTimelineEditorDrawerController.A01;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(8);
                        }
                        C19140WMw wMw2 = clipsTimelineEditorDrawerController.A0C;
                        if (wMw2 != null) {
                            wMw2.A0F.A02 = 0.0f;
                        }
                        r0 = AnonymousClass8RM.A07;
                    } else if (mqq instanceof C65083Ln3) {
                        r1 = clipsTimelineEditorDrawerController.A0e;
                        if (r1.CQ0(AnonymousClass80V.MEDIA_EDIT)) {
                            obj2 = new Object();
                        } else {
                            return;
                        }
                    } else if (!(mqq instanceof Ln6)) {
                        if (AnonymousClass9IF.A00(2, mqq)) {
                            r3 = clipsTimelineEditorDrawerController.A0k;
                            r2 = new C388499nv((Drawable) ((AnonymousClass9IF) mqq).A01);
                        } else if (mqq instanceof C61187Jyg) {
                            r3 = clipsTimelineEditorDrawerController.A0k;
                            C61187Jyg jyg = (C61187Jyg) mqq;
                            r2 = new C388509nw(jyg.A02, jyg.A00);
                        } else if (mqq instanceof C381959cr) {
                            C19140WMw wMw3 = clipsTimelineEditorDrawerController.A0C;
                            if (wMw3 != null) {
                                wMw3.A0F.A02 = 0.0f;
                            }
                            ClipsTimelineEditorDrawerController.A0D(clipsTimelineEditorDrawerController, AnonymousClass8RM.A0A);
                            ClipsTimelineEditorDrawerController.A06(clipsTimelineEditorDrawerController);
                            ClipsTimelineEditorDrawerController.A0G(clipsTimelineEditorDrawerController, true, true);
                            C19140WMw wMw4 = clipsTimelineEditorDrawerController.A0C;
                            if (wMw4 != null) {
                                wMw4.A06(true);
                                return;
                            }
                            return;
                        } else if (mqq instanceof C61185Jye) {
                            Integer valueOf = Integer.valueOf(((C61185Jye) mqq).A00);
                            C40645AgK agK = new C40645AgK(clipsTimelineEditorDrawerController);
                            clipsTimelineEditorDrawerController.A0r.A00(C59725JVj.POST_CAPTURE, clipsTimelineEditorDrawerController.A0b, agK, valueOf, true);
                            return;
                        } else if (AnonymousClass9IF.A00(5, mqq)) {
                            r3 = clipsTimelineEditorDrawerController.A0k;
                            r2 = C388589o4.A00;
                        } else if (mqq instanceof C65093LnE) {
                            r1 = clipsTimelineEditorDrawerController.A0e;
                            if (r1.CQ0(AnonymousClass80V.MEDIA_EDIT)) {
                                obj2 = new Object();
                            } else {
                                return;
                            }
                        } else if (mqq instanceof C65094LnF) {
                            r1 = clipsTimelineEditorDrawerController.A0e;
                            if (r1.CQ0(AnonymousClass80V.MEDIA_EDIT)) {
                                obj2 = new Object();
                            } else {
                                return;
                            }
                        } else if (mqq instanceof C65089LnA) {
                            r1 = clipsTimelineEditorDrawerController.A0e;
                            if (r1.CQ0(AnonymousClass80V.MEDIA_EDIT)) {
                                obj2 = new Object();
                            } else {
                                return;
                            }
                        } else if (mqq instanceof C65084Ln4) {
                            r1 = clipsTimelineEditorDrawerController.A0e;
                            if (r1.CQ0(AnonymousClass80V.MEDIA_EDIT)) {
                                obj2 = new Object();
                            } else {
                                return;
                            }
                        } else if ((mqq instanceof C65091LnC) && clipsTimelineEditorDrawerController.A0e.CQ0(AnonymousClass80V.CLIPS_EDITOR)) {
                            C19140WMw wMw5 = clipsTimelineEditorDrawerController.A0C;
                            if (wMw5 != null) {
                                r10 = wMw5.A0E.A0P(R.id.fragment_container);
                            }
                            if ((r10 instanceof ClipsStackedTimelineFragment) && (wMw = clipsTimelineEditorDrawerController.A0C) != null) {
                                wMw.A01 = AnonymousClass8RM.A0B.A00;
                                wMw.A03();
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                        r3.A03(r2);
                        return;
                    } else if (clipsTimelineEditorDrawerController.A0e.CQ0(AnonymousClass80V.MEDIA_EDIT) && (r02 = (C359318cb) clipsTimelineEditorDrawerController.A0w.get()) != null) {
                        r02.A0H();
                        return;
                    } else {
                        return;
                    }
                    r1.E3H(obj2);
                    return;
                }
                ClipsTimelineEditorDrawerController.A0D(clipsTimelineEditorDrawerController, r0);
                return;
            }
            ClipsTimelineEditorDrawerController.A0G(clipsTimelineEditorDrawerController, true, true);
            return;
        } else if (clipsTimelineEditorDrawerController.A0j.A0l()) {
            clipsTimelineEditorDrawerController.A0D = true;
            C19140WMw wMw6 = clipsTimelineEditorDrawerController.A0C;
            if (wMw6 != null) {
                wMw6.A0F.A02 = 0.0f;
            }
            ClipsTimelineEditorDrawerController.A0D(clipsTimelineEditorDrawerController, AnonymousClass8RM.A05);
            ClipsTimelineEditorDrawerController.A06(clipsTimelineEditorDrawerController);
            ClipsTimelineEditorDrawerController.A0G(clipsTimelineEditorDrawerController, true, false);
            return;
        }
        clipsTimelineEditorDrawerController.A0n.A0F(C40396AbT.A00);
        Context context = clipsTimelineEditorDrawerController.A0W;
        1xC r22 = 1xC.A01;
        C310336ap r12 = new C310336ap();
        r12.A0D = context.getString(2131955691);
        String string = context.getString(2131955692);
        0qQ.A07(string);
        r12.A0G = string;
        r12.A0A(new C40551Ady());
        r12.A0L = true;
        r22.A00(new AnonymousClass3GP(r12.A00()));
    }
}
