package X;

import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.direct.visual.DirectVisualMessageViewerControllerLifecycleUtil;
import com.instagram.direct.visual.model.DirectVisualMessageItemModel;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.volume.VolumeIndicator;
import com.instagram.user.model.User;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.NJb  reason: case insensitive filesystem */
public final class C68463NJb extends AnonymousClass4DH implements AnonymousClass4DR, C273434mZ {
    public static final String __redex_internal_original_name = "DirectVisualMessageViewerFragment";
    public UserSession A00;
    public DirectVisualMessageViewerController A01;
    public C273404mW A02;

    public final String getModuleName() {
        return "direct_story_viewer_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2;
        View view3;
        SegmentedProgressBar segmentedProgressBar;
        CircularImageView circularImageView;
        VolumeIndicator volumeIndicator;
        View view4;
        OW6 ow6;
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel;
        1aU A05;
        String str2;
        1aU A052;
        1aU A002;
        SegmentedProgressBar segmentedProgressBar2;
        C68167N3h A003;
        View view5 = view;
        0qQ.A0B(view5, 0);
        super.onViewCreated(view5, bundle);
        AnonymousClass2uJ.A03(requireActivity());
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController != null) {
            FragmentActivity fragmentActivity = directVisualMessageViewerController.A0e;
            Window window = fragmentActivity.getWindow();
            0qQ.A07(window);
            C61290mR.A05(window);
            OW6 ow62 = directVisualMessageViewerController.A0G;
            if (ow62 == null || (A003 = ow62.A00()) == null) {
                str = null;
            } else {
                str = A003.A0G;
            }
            AnonymousClass7GR r4 = directVisualMessageViewerController.A0s;
            r4.A01(str);
            OW6 ow63 = directVisualMessageViewerController.A0G;
            if (ow63 != null) {
                boolean z = directVisualMessageViewerController.A1C;
                AnonymousClass4DU r0 = directVisualMessageViewerController.A0v;
                AnonymousClass4DU r24 = r0;
                String str3 = directVisualMessageViewerController.A16;
                UserSession userSession = directVisualMessageViewerController.A0m;
                C69220Nha nha = new C69220Nha(userSession, ow63, r4, r0, str3, z);
                AnonymousClass4DH r42 = directVisualMessageViewerController.A0f;
                directVisualMessageViewerController.videoPlayer = new C72980PRn(fragmentActivity, userSession, nha, directVisualMessageViewerController, r42.getModuleName());
                directVisualMessageViewerController.photoTimerController = new AnonymousClass6g5(directVisualMessageViewerController);
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = directVisualMessageViewerController.viewerContainer;
                if (touchInterceptorFrameLayout != null) {
                    view2 = touchInterceptorFrameLayout.findViewById(R.id.direct_visual_message_viewer_root_container);
                } else {
                    view2 = null;
                }
                directVisualMessageViewerController.rootView = view2;
                TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = directVisualMessageViewerController.viewerContainer;
                if (touchInterceptorFrameLayout2 != null) {
                    directVisualMessageViewerController.contentView = touchInterceptorFrameLayout2.requireViewById(R.id.direct_expiring_media_viewer_content);
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout3 = directVisualMessageViewerController.viewerContainer;
                    if (touchInterceptorFrameLayout3 != null) {
                        view3 = touchInterceptorFrameLayout3.findViewById(R.id.direct_expiring_media_viewer_container);
                    } else {
                        view3 = null;
                    }
                    directVisualMessageViewerController.itemView = view3;
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout4 = directVisualMessageViewerController.viewerContainer;
                    if (touchInterceptorFrameLayout4 != null) {
                        ViewStub A0X = JTR.A0X(touchInterceptorFrameLayout4, R.id.direct_media_view_stub);
                        A0X.setLayoutResource(R.layout.layout_rounded_media);
                        A0X.inflate();
                        View view6 = directVisualMessageViewerController.contentView;
                        if (view6 != null) {
                            View requireViewById = view6.requireViewById(R.id.viewer_info_header);
                            directVisualMessageViewerController.viewerInfoContainer = requireViewById;
                            if (requireViewById != null) {
                                requireViewById.setVisibility(0);
                            }
                            TouchInterceptorFrameLayout touchInterceptorFrameLayout5 = directVisualMessageViewerController.viewerContainer;
                            if (touchInterceptorFrameLayout5 != null) {
                                segmentedProgressBar = (SegmentedProgressBar) touchInterceptorFrameLayout5.findViewById(R.id.reel_viewer_progress_bar);
                            } else {
                                segmentedProgressBar = null;
                            }
                            directVisualMessageViewerController.progressBar = segmentedProgressBar;
                            0Tu r7 = 0Tu.A05;
                            if (182.A06(r7, userSession, 36324346603515929L) && (segmentedProgressBar2 = directVisualMessageViewerController.progressBar) != null) {
                                segmentedProgressBar2.setLayerType(1, (Paint) null);
                            }
                            TouchInterceptorFrameLayout touchInterceptorFrameLayout6 = directVisualMessageViewerController.viewerContainer;
                            if (touchInterceptorFrameLayout6 != null) {
                                circularImageView = (CircularImageView) touchInterceptorFrameLayout6.findViewById(R.id.profile_transition_view);
                            } else {
                                circularImageView = null;
                            }
                            directVisualMessageViewerController.A0A = circularImageView;
                            View view7 = directVisualMessageViewerController.contentView;
                            if (view7 != null) {
                                OIU oiu = new OIU(fragmentActivity, view7, userSession);
                                directVisualMessageViewerController.contentHolder = oiu;
                                View view8 = directVisualMessageViewerController.contentView;
                                if (view8 != null) {
                                    view8.setTag(oiu);
                                }
                                TouchInterceptorFrameLayout touchInterceptorFrameLayout7 = directVisualMessageViewerController.viewerContainer;
                                if (touchInterceptorFrameLayout7 != null) {
                                    volumeIndicator = (VolumeIndicator) touchInterceptorFrameLayout7.findViewById(R.id.direct_expiring_media_viewer_volume_indicator);
                                } else {
                                    volumeIndicator = null;
                                }
                                directVisualMessageViewerController.volumeIndicator = volumeIndicator;
                                C254743sy r6 = directVisualMessageViewerController.A0x;
                                directVisualMessageViewerController.A0B = new OIE(userSession, str3, C66647MaG.A0A(r6), z);
                                directVisualMessageViewerController.A0C = new C67087Mi3(userSession);
                                TouchInterceptorFrameLayout touchInterceptorFrameLayout8 = directVisualMessageViewerController.viewerContainer;
                                if (touchInterceptorFrameLayout8 != null) {
                                    View requireViewById2 = touchInterceptorFrameLayout8.requireViewById(R.id.direct_visual_message_viewer_composer_container);
                                    directVisualMessageViewerController.replyComposerContainer = requireViewById2;
                                    if (requireViewById2 != null) {
                                        directVisualMessageViewerController.replyComposer = requireViewById2.requireViewById(R.id.direct_visual_message_viewer_composer);
                                        View view9 = directVisualMessageViewerController.replyComposerContainer;
                                        if (view9 != null) {
                                            EditText A0E = DbU.A0E(view9, R.id.direct_expiring_media_viewer_composer_edit_text);
                                            directVisualMessageViewerController.composerEditText = A0E;
                                            if (A0E != null) {
                                                A0E.setVisibility(DbW.A01(directVisualMessageViewerController.A1B ? 1 : 0));
                                            }
                                            TouchInterceptorFrameLayout touchInterceptorFrameLayout9 = directVisualMessageViewerController.viewerContainer;
                                            if (touchInterceptorFrameLayout9 != null) {
                                                view4 = touchInterceptorFrameLayout9.findViewById(R.id.background_dimmer);
                                            } else {
                                                view4 = null;
                                            }
                                            directVisualMessageViewerController.backgroundDimmer = view4;
                                            TouchInterceptorFrameLayout touchInterceptorFrameLayout10 = directVisualMessageViewerController.viewerContainer;
                                            if (touchInterceptorFrameLayout10 != null) {
                                                directVisualMessageViewerController.privacyOverlayStubHolder = DbV.A0T(touchInterceptorFrameLayout10, R.id.visual_privacy_overlay_stub, false);
                                                AnonymousClass2Ep r14 = directVisualMessageViewerController.A0n;
                                                if (r14 == null || !r14.CVE()) {
                                                    View view10 = directVisualMessageViewerController.replyComposer;
                                                    if (view10 != null) {
                                                        DbU.A11(view10.getContext(), view10, R.drawable.visual_message_viewer_composer_background);
                                                    }
                                                    directVisualMessageViewerController.A0W = false;
                                                } else {
                                                    View view11 = directVisualMessageViewerController.replyComposer;
                                                    if (view11 != null) {
                                                        DbU.A11(view11.getContext(), view11, R.drawable.visual_message_viewer_composer_background_shhmode);
                                                    }
                                                    directVisualMessageViewerController.A0W = true;
                                                }
                                                EditText editText = directVisualMessageViewerController.composerEditText;
                                                if (editText != null) {
                                                    editText.setOnEditorActionListener(new IEI(directVisualMessageViewerController, 2));
                                                }
                                                View view12 = directVisualMessageViewerController.replyComposerContainer;
                                                if (view12 != null) {
                                                    View A0G = AnonymousClass7TF.A0G(view12, R.id.direct_expiring_media_viewer_composer_camera_button);
                                                    boolean z2 = directVisualMessageViewerController.A1G;
                                                    if (z2) {
                                                        if (!(r6 instanceof DirectThreadKey) || r14 == null || !r14.CVE()) {
                                                            DbU.A11(A0G.getContext(), A0G, R.drawable.reels_composer_camera_button_ring);
                                                        } else {
                                                            DbU.A11(A0G.getContext(), A0G, R.drawable.reels_composer_camera_button_ring_shhmode);
                                                        }
                                                        A0G.setVisibility(0);
                                                        AnonymousClass0fU.A00(new C71408Ok7(68, (Object) directVisualMessageViewerController, (Object) A0G), A0G);
                                                        C70485O8k o8k = directVisualMessageViewerController.A0u;
                                                        UserSession userSession2 = o8k.A00;
                                                        if (AnonymousClass7TE.A0q(userSession2).getInt("camera_reply_tooltip_impression_count", 0) < 3 && 182.A06(r7, userSession2, 36325579259393087L)) {
                                                            A0G.postDelayed(new C73323Pai(fragmentActivity, A0G, o8k), 1000);
                                                        }
                                                    } else {
                                                        A0G.setVisibility(8);
                                                    }
                                                    View view13 = directVisualMessageViewerController.replyComposerContainer;
                                                    if (view13 != null) {
                                                        View requireViewById3 = view13.requireViewById(R.id.direct_expiring_media_text_send_button);
                                                        directVisualMessageViewerController.textSendButton = requireViewById3;
                                                        if (requireViewById3 != null) {
                                                            C71402Ok1.A00(requireViewById3, 12, directVisualMessageViewerController);
                                                        }
                                                        directVisualMessageViewerController.composerTextWatcher = new C71273OhE(directVisualMessageViewerController, 24);
                                                        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(directVisualMessageViewerController, false, false);
                                                        directVisualMessageViewerController.keyboardHeightChangeDetector = A012;
                                                        A012.A9Y(directVisualMessageViewerController);
                                                        boolean z3 = r6 instanceof MsysThreadId;
                                                        boolean z4 = z3;
                                                        if (z3 && !z2) {
                                                            View view14 = directVisualMessageViewerController.replyComposerContainer;
                                                            RectF rectF = 0nA.A01;
                                                            if (view14 != null) {
                                                                view14.setVisibility(8);
                                                            }
                                                            directVisualMessageViewerController.replyComposerContainer = null;
                                                        }
                                                        TouchInterceptorFrameLayout touchInterceptorFrameLayout11 = directVisualMessageViewerController.viewerContainer;
                                                        if (touchInterceptorFrameLayout11 != null) {
                                                            View findViewById = touchInterceptorFrameLayout11.findViewById(R.id.direct_expiring_media_view_once_pause_sparkler_stub);
                                                            0qQ.A0C(findViewById, "null cannot be cast to non-null type android.view.ViewStub");
                                                            directVisualMessageViewerController.sparklerAnimationStubHolder = new C71662eb((ViewStub) findViewById);
                                                            TouchInterceptorFrameLayout touchInterceptorFrameLayout12 = directVisualMessageViewerController.viewerContainer;
                                                            if (touchInterceptorFrameLayout12 != null) {
                                                                directVisualMessageViewerController.blurImageViewContainerStubHolder = DbY.A0T(touchInterceptorFrameLayout12, R.id.direct_expiring_media_blur_image_stub);
                                                                View view15 = directVisualMessageViewerController.itemView;
                                                                if (view15 != null) {
                                                                    directVisualMessageViewerController.A0M = new C314626ia(fragmentActivity, view15, r42, userSession, r24, directVisualMessageViewerController.A0z);
                                                                    OW6 ow64 = directVisualMessageViewerController.A0G;
                                                                    if (ow64 != null && ow64.A01 > 0 && directVisualMessageViewerController.contentHolder != null) {
                                                                        View view16 = directVisualMessageViewerController.contentView;
                                                                        if (view16 != null) {
                                                                            view16.setVisibility(4);
                                                                        }
                                                                        if (directVisualMessageViewerController.A0Q != null) {
                                                                            User A0j = DbT.A0j(userSession);
                                                                            String str4 = directVisualMessageViewerController.A0Q;
                                                                            if (str4 != null) {
                                                                                DirectVisualMessageViewerController.A00(directVisualMessageViewerController, A0j, str4);
                                                                                directVisualMessageViewerController.A0Q = null;
                                                                            } else {
                                                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                                                            }
                                                                        }
                                                                        C68167N3h A004 = ow64.A00();
                                                                        OIU oiu2 = directVisualMessageViewerController.contentHolder;
                                                                        if (oiu2 != null) {
                                                                            oiu2.A0J.A06(R.id.direct_visual_message_viewer_fragment_image_view_id);
                                                                            if (!A004.A0S || A004.A0R) {
                                                                                View view17 = directVisualMessageViewerController.contentView;
                                                                                if (view17 != null) {
                                                                                    0nA.A0p(view17, new PWQ(directVisualMessageViewerController));
                                                                                } else {
                                                                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                                                                }
                                                                            } else {
                                                                                OIU oiu3 = directVisualMessageViewerController.contentHolder;
                                                                                if (oiu3 != null) {
                                                                                    oiu3.A0J.A0A(new WXH(directVisualMessageViewerController, 2), R.id.direct_visual_message_viewer_fragment_image_view_id);
                                                                                } else {
                                                                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                                                                }
                                                                            }
                                                                            List list = ow64.A03;
                                                                            int size = list.size();
                                                                            int i = 0;
                                                                            while (true) {
                                                                                if (i >= size) {
                                                                                    int size2 = list.size();
                                                                                    int i2 = 0;
                                                                                    while (true) {
                                                                                        if (i2 >= size2) {
                                                                                            DirectVisualMessageViewerController.A0E(directVisualMessageViewerController);
                                                                                            break;
                                                                                        }
                                                                                        C68167N3h A013 = ow64.A01(i2);
                                                                                        if (A013 == null || A013.A08 == null) {
                                                                                            i2++;
                                                                                        } else {
                                                                                            OCM ocm = new OCM(userSession);
                                                                                            directVisualMessageViewerController.A0J = ocm;
                                                                                            1a8 r43 = directVisualMessageViewerController.A0l;
                                                                                            OW6 ow65 = directVisualMessageViewerController.A0G;
                                                                                            if (ow65 != null) {
                                                                                                List list2 = ow65.A03;
                                                                                                ArrayList A0m = C51970G9q.A0m(list2);
                                                                                                ArrayList A0m2 = C51970G9q.A0m(list2);
                                                                                                int size3 = list2.size();
                                                                                                for (int i3 = 0; i3 < size3; i3++) {
                                                                                                    C68167N3h A014 = ow65.A01(i3);
                                                                                                    if (!(A014 == null || A014.A08 == null)) {
                                                                                                        DirectVisualMessageItemModel.MediaFields.RemixMedia remixMedia = A014.A08;
                                                                                                        if (remixMedia != null) {
                                                                                                            File A005 = O0Q.A00(ocm.A01).A00(DbT.A10(remixMedia.A00));
                                                                                                            if (A005 == null || (str2 = A005.getCanonicalPath()) == null) {
                                                                                                                str2 = "";
                                                                                                            }
                                                                                                            1aU A09 = 1aU.A09(str2);
                                                                                                            boolean A1W = AnonymousClass7TF.A1W(A014.A0B, 1iA.A0a);
                                                                                                            1aU A092 = 1aU.A09(DbT.A10(remixMedia.A01));
                                                                                                            int i4 = 28;
                                                                                                            if (A1W) {
                                                                                                                i4 = 27;
                                                                                                            }
                                                                                                            A0m.add(1aU.A02(new OuU((0sL) new JGK(A014, i4), 6), A09, A092));
                                                                                                            AnonymousClass7TF.A1M(A0m2, i3);
                                                                                                        } else {
                                                                                                            throw AnonymousClass7TE.A0z("media fields cannot be null");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (A0m.isEmpty()) {
                                                                                                    A05 = 1aU.A09(ow65);
                                                                                                } else {
                                                                                                    A05 = 1aU.A05(new C72018Ous(new C74185PqR(49, (Object) A0m2, (Object) ow65), 1), A0m);
                                                                                                }
                                                                                                PU7.A00(A05, r43, directVisualMessageViewerController, 14);
                                                                                            } else {
                                                                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    C68167N3h A015 = ow64.A01(i);
                                                                                    if (A015 == null || A015.A09 == null) {
                                                                                        i++;
                                                                                    } else {
                                                                                        OCM ocm2 = new OCM(userSession);
                                                                                        directVisualMessageViewerController.A0J = ocm2;
                                                                                        1a8 r19 = directVisualMessageViewerController.A0l;
                                                                                        OW6 ow66 = directVisualMessageViewerController.A0G;
                                                                                        if (ow66 != null) {
                                                                                            List list3 = ow66.A03;
                                                                                            ArrayList A0m3 = C51970G9q.A0m(list3);
                                                                                            ArrayList A0m4 = C51970G9q.A0m(list3);
                                                                                            int size4 = list3.size();
                                                                                            for (int i5 = 0; i5 < size4; i5++) {
                                                                                                C68167N3h A016 = ow66.A01(i5);
                                                                                                if (!(A016 == null || A016.A09 == null)) {
                                                                                                    DirectVisualMessageItemModel.MediaFields.TamMedia tamMedia = A016.A09;
                                                                                                    if (tamMedia != null) {
                                                                                                        String A10 = DbT.A10(tamMedia.A00);
                                                                                                        MYc mYc = C66594MYg.A03;
                                                                                                        UserSession userSession3 = ocm2.A01;
                                                                                                        AnonymousClass61K r3 = AnonymousClass61K.DIRECT_VISUAL_MESSAGE;
                                                                                                        1aU A022 = mYc.A02(userSession3, r3).A01.A02(A10);
                                                                                                        if (AnonymousClass7TF.A1W(A016.A0B, 1iA.A0a)) {
                                                                                                            A002 = 1aU.A02(new OuU((0sL) new JGK(A016, 26), 6), A022, mYc.A02(userSession3, r3).A01.A02(DbT.A10(tamMedia.A01)));
                                                                                                        } else {
                                                                                                            A002 = C72168Oxd.A00(A022, A016, ocm2, 9);
                                                                                                        }
                                                                                                        A0m3.add(A002);
                                                                                                        AnonymousClass7TF.A1M(A0m4, i5);
                                                                                                    } else {
                                                                                                        throw AnonymousClass7TE.A0z("media fields cannot be null");
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (A0m3.isEmpty()) {
                                                                                                A052 = 1aU.A09(ow66);
                                                                                            } else {
                                                                                                A052 = 1aU.A05(new C72018Ous(new J6S(0, A0m4, ow66), 1), A0m3);
                                                                                            }
                                                                                            PU7.A00(A052, r19, directVisualMessageViewerController, 15);
                                                                                        } else {
                                                                                            throw AnonymousClass7TE.A0z("Required value was null.");
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            throw AnonymousClass7TE.A0z("Required value was null.");
                                                                        }
                                                                    }
                                                                    if (z4 && directVisualMessageViewerController.A0J != null && (ow6 = directVisualMessageViewerController.A0G) != null) {
                                                                        Collection A0C = C229632nm.A0C(0, ow6.A03.size());
                                                                        if (!(A0C instanceof Collection) || !A0C.isEmpty()) {
                                                                            0sh it = A0C.iterator();
                                                                            while (it.hasNext()) {
                                                                                C68167N3h A017 = ow6.A01(it.A00());
                                                                                if (A017 != null && (privacyMediaOverlayViewModel = A017.A00) != null && privacyMediaOverlayViewModel.A00 == 1) {
                                                                                    C66594MYg A018 = MYc.A01(userSession, __redex_internal_original_name);
                                                                                    MYb mYb = A018.A01;
                                                                                    1a8 r32 = directVisualMessageViewerController.A0l;
                                                                                    1aU A006 = MYb.A00(mYb);
                                                                                    C72174Oxj oxj = C72174Oxj.A00;
                                                                                    0qQ.A0C(oxj, "null cannot be cast to non-null type com.instagram.common.rx.Predicate<kotlin.collections.Set<kotlin.String?>>");
                                                                                    PU7.A00(A006.A0N(oxj).A0K(new C72027Ov1(8, A018, directVisualMessageViewerController)), r32, directVisualMessageViewerController, 16);
                                                                                    return;
                                                                                }
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                                            }
                                                            throw AnonymousClass7TE.A0z("Required value was null.");
                                                        }
                                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                                    }
                                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                                }
                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                            }
                                            throw AnonymousClass7TE.A0z("Required value was null.");
                                        }
                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                    }
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final AnonymousClass4DJ B7u() {
        return this;
    }

    public final void EIL() {
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController != null) {
            C19700We2 we2 = directVisualMessageViewerController.A0H;
            if (we2 != null) {
                we2.A00();
                C19700We2 we22 = directVisualMessageViewerController.A0H;
                if (we22 != null) {
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout = directVisualMessageViewerController.viewerContainer;
                    if (touchInterceptorFrameLayout != null) {
                        C317416nE.A00(touchInterceptorFrameLayout, we22);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
            }
            0qQ.A0F("directMediaViewerGestureController");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController == null) {
            return false;
        }
        directVisualMessageViewerController.onBackPressed();
        return true;
    }

    public final TouchInterceptorFrameLayout C8v() {
        return AnonymousClass7TF.A0F(requireView(), R.id.direct_visual_message_viewer_root_container);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x017d, code lost:
        if (r0 != 3) goto L_0x017f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0222  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r87) {
        /*
            r86 = this;
            r0 = -640881070(0xffffffffd9ccee52, float:-7.2103664E15)
            int r25 = X.AnonymousClass0fD.A02(r0)
            r3 = r86
            r26 = r87
            r0 = r26
            X.C68463NJb.super.onCreate(r0)
            android.os.Bundle r0 = r3.requireArguments()
            com.instagram.common.session.UserSession r1 = X.DbX.A0U(r3)
            r3.A00 = r1
            java.lang.String r24 = "userSession"
            r40 = 0
            if (r1 == 0) goto L_0x0348
            X.2Dm r23 = X.1bJ.A00(r1)
            java.lang.String r1 = "DirectStoryViewerFragment.ARGUMENTS_IS_REPLAY"
            r9 = 0
            boolean r80 = r0.getBoolean(r1, r9)
            java.lang.String r1 = "DirectVisualMessageViewerFragment.NEEDS_THUMBNAIL_ANIMATION"
            boolean r81 = r0.getBoolean(r1)
            java.lang.String r1 = "DirectFragment.ENTRY_POINT"
            java.lang.String r2 = r0.getString(r1)
            java.lang.String r22 = "Required value was null."
            if (r2 == 0) goto L_0x03dd
            java.lang.String r1 = "DirectVisualMessageViewerFragment.REPLAY_SESSION_ID"
            java.lang.String r73 = r0.getString(r1)
            java.lang.String r10 = "DirectVisualMessageViewerFragment"
            if (r73 != 0) goto L_0x004e
            java.lang.String r1 = "Replay session ID is null: entry_point= "
            java.lang.String r1 = X.002.A0R(r1, r2)
            X.0wb.A03(r10, r1)
        L_0x004e:
            java.lang.String r1 = "DirectStoryViewerFragment.ARGUMENT_UNSEEN_STORIES_COUNT"
            int r21 = r0.getInt(r1)
            java.lang.String r1 = "DirectStoryViewerFragment.ARGUMENT_SEEN_STORIES_COUNT"
            int r20 = r0.getInt(r1)
            java.lang.String r1 = "DirectVisualMessageViewerFragment.VISUAL_MESSAGE_VIEWER_ARGUMENT_REEL_VIEWER_CONFIG"
            android.os.Parcelable r14 = r0.getParcelable(r1)
            if (r14 == 0) goto L_0x03e5
            com.instagram.model.reels.ReelViewerConfig r14 = (com.instagram.model.reels.ReelViewerConfig) r14
            r1 = 440(0x1b8, float:6.17E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r74 = r0.getString(r1)
            r1 = 924(0x39c, float:1.295E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r72 = r0.getString(r1)
            r1 = 24
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            android.os.Parcelable r19 = r0.getParcelable(r1)
            r1 = r19
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            r19 = r1
            java.lang.String r1 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_FRAGMENT_ENTER_ANIMATION"
            int r79 = r0.getInt(r1, r9)
            java.lang.String r1 = "DirectVisualMessageViewerFragment.SKIP_ENTRY_ANIMATION"
            boolean r84 = r0.getBoolean(r1)
            java.lang.String r1 = "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY"
            X.3sy r11 = X.C67002Mga.A00(r0, r1)
            if (r11 == 0) goto L_0x03d5
            java.lang.String r1 = "DirectStoryViewerFragment.ARGUMENTS_RECIPIENT_IDS"
            java.util.ArrayList r77 = r0.getStringArrayList(r1)
            java.lang.String r1 = "DirectStoryViewerFragment.ARGUMENTS_THREAD_TITLE"
            java.lang.String r71 = r0.getString(r1)
            java.lang.String r1 = "DirectVisualMessageViewerFragment.VISUAL_REPLIES_ENABLED"
            boolean r82 = r0.getBoolean(r1)
            java.lang.String r1 = "DirectVisualMessageViewerFragment.COMPOSER_ENABLED"
            r8 = 1
            boolean r83 = r0.getBoolean(r1, r8)
            boolean r4 = r11 instanceof com.instagram.model.direct.DirectThreadKey
            if (r4 == 0) goto L_0x00d6
            r1 = r23
            X.3U9 r65 = X.C66647MaG.A02(r1, r11)
            if (r65 != 0) goto L_0x00d8
            X.DbT.A1K(r3)
            java.lang.String r0 = "Thread summary is null: entry_point= "
            java.lang.String r0 = X.002.A0R(r0, r2)
            X.0wb.A03(r10, r0)
            r1 = 1918815102(0x725ecb7e, float:4.4129075E30)
        L_0x00d0:
            r0 = r25
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x00d6:
            r65 = r40
        L_0x00d8:
            java.lang.String r1 = "DirectVisualMessageViewerFragment.VISUAL_MESSAGE_ITEMS"
            java.util.ArrayList r12 = r0.getParcelableArrayList(r1)
            java.lang.String r1 = "DirectVisualMessageViewerFragment.USE_DIRECT_VISUAL_MESSAGE_ITEM_MODEL"
            boolean r85 = r0.getBoolean(r1)
            r1 = 2233(0x8b9, float:3.129E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r55 = r0.getBoolean(r1)
            if (r65 == 0) goto L_0x00fe
            X.4li r1 = r65.Axk()
            if (r1 == 0) goto L_0x00fe
            java.lang.Integer r1 = r1.A02
            if (r1 == 0) goto L_0x00fe
            java.lang.Long r40 = X.C51969G9p.A0r(r1)
        L_0x00fe:
            r62 = 0
            if (r4 == 0) goto L_0x012c
            com.instagram.common.session.UserSession r4 = r3.A00
            if (r4 == 0) goto L_0x0348
            r1 = r11
            com.instagram.model.direct.DirectThreadKey r1 = (com.instagram.model.direct.DirectThreadKey) r1
            java.lang.Integer r5 = X.AnonymousClass05K.A04
            X.0qQ.A0B(r1, r8)
            X.797 r4 = X.AnonymousClass796.A03(r4, r1, r5)
            X.797 r5 = X.AnonymousClass797.OPEN_ONLY
            boolean r7 = X.C51969G9p.A1a(r4, r5)
            com.instagram.common.session.UserSession r4 = r3.A00
            if (r4 == 0) goto L_0x0348
            java.lang.Integer r6 = X.AnonymousClass05K.A03
            X.797 r1 = X.AnonymousClass796.A03(r4, r1, r6)
            boolean r1 = X.C51969G9p.A1a(r1, r5)
            if (r7 != 0) goto L_0x012a
            if (r1 == 0) goto L_0x012c
        L_0x012a:
            r62 = 1
        L_0x012c:
            java.lang.String r1 = "DirectVisualMessageViewerFragment.IS_OPEN_MESSAGE"
            boolean r64 = r0.getBoolean(r1, r9)
            if (r12 == 0) goto L_0x01f5
            com.instagram.common.session.UserSession r0 = r3.A00
            if (r0 == 0) goto L_0x0348
            int r1 = r12.size()
            java.util.ArrayList r15 = X.DbS.A0v(r1)
            X.17i r13 = X.17h.A00(r0)
            java.util.Iterator r18 = r12.iterator()
        L_0x0148:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x01f9
            java.lang.Object r1 = r18.next()
            com.instagram.direct.visual.model.DirectVisualMessageItemModel r1 = (com.instagram.direct.visual.model.DirectVisualMessageItemModel) r1
            java.lang.String r12 = r1.A06
            com.instagram.user.model.User r37 = r13.A02(r12)
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields r4 = r1.A02
            java.lang.String r0 = r1.A05
            r41 = r0
            java.lang.String r0 = r1.A04
            r27 = r0
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x01f1
            X.1iA r36 = X.1iA.A0a
        L_0x016a:
            long r5 = r1.A01
            r16 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r16
            X.0sn r50 = X.0sn.A00
            int r0 = r1.A00
            r59 = 1
            if (r0 == r8) goto L_0x017f
            r59 = 0
            r7 = 3
            r60 = 1
            if (r0 == r7) goto L_0x0181
        L_0x017f:
            r60 = 0
        L_0x0181:
            r28 = 0
            r16 = 5
            java.lang.Long r38 = java.lang.Long.valueOf(r16)
            r51 = 1065353216(0x3f800000, float:1.0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            if (r7 == 0) goto L_0x01ee
            if (r0 != r8) goto L_0x01e2
            java.lang.String r49 = "once"
        L_0x0195:
            boolean r0 = r4 instanceof com.instagram.direct.visual.model.DirectVisualMessageItemModel.MediaFields.TamMedia
            if (r0 == 0) goto L_0x01df
            r7 = r4
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$TamMedia r7 = (com.instagram.direct.visual.model.DirectVisualMessageItemModel.MediaFields.TamMedia) r7
        L_0x019c:
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r1 = r1.A03
            boolean r0 = r4 instanceof com.instagram.direct.visual.model.DirectVisualMessageItemModel.MediaFields.RemixMedia
            if (r0 == 0) goto L_0x01dc
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$RemixMedia r4 = (com.instagram.direct.visual.model.DirectVisualMessageItemModel.MediaFields.RemixMedia) r4
        L_0x01a4:
            java.lang.String r43 = ""
            X.N3h r0 = new X.N3h
            r29 = r28
            r30 = r28
            r31 = r28
            r32 = r4
            r33 = r7
            r34 = r1
            r35 = r28
            r39 = r28
            r42 = r27
            r44 = r12
            r45 = r43
            r46 = r28
            r47 = r28
            r48 = r28
            r52 = r9
            r53 = r5
            r56 = r9
            r57 = r8
            r58 = r9
            r61 = r9
            r63 = r9
            r27 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            r15.add(r0)
            goto L_0x0148
        L_0x01dc:
            r4 = r28
            goto L_0x01a4
        L_0x01df:
            r7 = r28
            goto L_0x019c
        L_0x01e2:
            r7 = 2
            if (r0 != r7) goto L_0x01e8
            java.lang.String r49 = "replayable"
            goto L_0x0195
        L_0x01e8:
            r7 = 3
            if (r0 != r7) goto L_0x01ee
            java.lang.String r49 = "permanent"
            goto L_0x0195
        L_0x01ee:
            r49 = 0
            goto L_0x0195
        L_0x01f1:
            X.1iA r36 = X.1iA.A0Q
            goto L_0x016a
        L_0x01f5:
            java.util.List r15 = java.util.Collections.emptyList()
        L_0x01f9:
            int r0 = r2.hashCode()
            r1 = -874443254(0xffffffffcbe10e0a, float:-2.9498388E7)
            if (r0 == r1) goto L_0x0399
            r1 = 3452698(0x34af1a, float:4.83826E-39)
            if (r0 == r1) goto L_0x038d
            r1 = 100344454(0x5fb2286, float:2.3616608E-35)
            if (r0 != r1) goto L_0x03a9
            java.lang.String r0 = "inbox"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03a9
            java.lang.String r0 = "direct_inbox"
        L_0x0216:
            X.2kQ r7 = X.C227942kP.A01(r0, r8, r9)
            java.lang.String r6 = X.AnonymousClass7TG.A0j()
            com.instagram.common.session.UserSession r0 = r3.A00
            if (r0 == 0) goto L_0x0348
            java.lang.Class<X.O61> r5 = X.O61.class
            r4 = 30
            X.Pha r1 = new X.Pha
            r1.<init>(r0, r4)
            java.lang.Object r0 = r0.A01(r5, r1)
            X.O61 r0 = (X.O61) r0
            java.lang.String r5 = X.C66647MaG.A0A(r11)
            if (r87 != 0) goto L_0x0269
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0wc r1 = X.AnonymousClass0kN.A01(r7, r0)
            java.lang.String r0 = "direct_story_playback_entry"
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r80)
            java.lang.String r1 = "is_replay"
            r0.A7p(r1, r4)
            X.C66580MXl.A1J(r0, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            java.lang.String r1 = "viewed_reel_count"
            r0.A8k(r1, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            java.lang.String r1 = "new_reel_count"
            r0.A8k(r1, r4)
            java.lang.String r1 = "viewer_session_id"
            r0.AAJ(r1, r6)
            r0.Cgf()
        L_0x0269:
            com.instagram.common.session.UserSession r1 = r3.A00
            if (r1 == 0) goto L_0x0348
            androidx.fragment.app.FragmentActivity r61 = r3.requireActivity()
            X.0qQ.A0A(r15)
            if (r73 != 0) goto L_0x0278
            java.lang.String r73 = ""
        L_0x0278:
            com.instagram.direct.visual.DirectVisualMessageViewerController r0 = new com.instagram.direct.visual.DirectVisualMessageViewerController
            r59 = r0
            r60 = r19
            r62 = r3
            r63 = r7
            r64 = r1
            r66 = r23
            r67 = r7
            r68 = r3
            r69 = r11
            r70 = r14
            r75 = r6
            r76 = r2
            r78 = r15
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85)
            r3.A01 = r0
            com.instagram.common.session.UserSession r12 = r0.A0m
            androidx.fragment.app.FragmentActivity r11 = r0.A0e
            X.3KG r1 = X.AnonymousClass3KF.A00(r11, r12)
            r0.A07 = r1
            r2 = 25
            X.NMI r1 = new X.NMI
            r1.<init>((java.lang.Object) r0, (int) r2)
            r0.A06 = r1
            boolean r1 = X.0mk.A02(r11)
            r0.A0V = r1
            int r1 = X.0nA.A09(r11)
            r0.A05 = r1
            int r1 = X.0nA.A08(r11)
            r0.A04 = r1
            android.content.res.Resources r2 = r11.getResources()
            r1 = 2131165250(0x7f070042, float:1.7944712E38)
            int r4 = r2.getDimensionPixelOffset(r1)
            int r2 = X.0nA.A09(r11)
            boolean r1 = X.0mk.A02(r11)
            if (r1 == 0) goto L_0x02d5
            int r4 = r2 - r4
        L_0x02d5:
            r0.A01 = r4
            X.4DH r2 = r0.A0f
            X.6jt r1 = new X.6jt
            r1.<init>(r11, r2, r12)
            r0.A0O = r1
            X.OGO r1 = new X.OGO
            r1.<init>(r11, r12)
            r0.A0N = r1
            boolean r1 = r0.A1E
            r5 = 0
            if (r1 != 0) goto L_0x0350
            X.3sy r6 = r0.A0x
            boolean r1 = r6 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r1 != 0) goto L_0x0350
            X.2Dm r14 = r0.A0p
            X.2Ep r13 = r0.A0n
            if (r13 == 0) goto L_0x03f2
            boolean r4 = r0.A1C
            java.lang.String r1 = r0.A14
            X.OLj r10 = new X.OLj
            r15 = r1
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            com.instagram.model.direct.DirectThreadKey r6 = X.C66647MaG.A03(r6)
            java.lang.String r4 = r0.A13
            java.lang.String r1 = r0.A11
            X.OW6 r1 = r10.A00(r6, r4, r1)
            r0.A0G = r1
            if (r1 != 0) goto L_0x0325
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            X.OW6 r10 = new X.OW6
            r15 = r9
            r16 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.A0G = r10
            r11.finish()
        L_0x0325:
            X.PAO r4 = new X.PAO
            r4.<init>(r0)
            X.OsF r1 = new X.OsF
            r1.<init>(r11, r5, r12, r4)
            r0.A0E = r1
        L_0x0331:
            X.4DU r5 = r0.A0v
            X.IT0 r4 = new X.IT0
            r4.<init>(r12)
            X.2pp r1 = new X.2pp
            r1.<init>(r12, r4, r5, r9)
            r0.A0K = r1
            com.instagram.direct.visual.DirectVisualMessageViewerController.A0D(r0)
            X.2pp r1 = r0.A0K
            if (r1 != 0) goto L_0x03b8
            java.lang.String r24 = "impressionTracker"
        L_0x0348:
            X.0qQ.A0F(r24)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x0350:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.List r1 = r0.A19
            if (r1 == 0) goto L_0x0374
            X.17i r5 = X.17h.A00(r12)
            java.util.Iterator r4 = r1.iterator()
        L_0x0360:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0374
            java.lang.String r1 = X.AnonymousClass7TE.A18(r4)
            com.instagram.user.model.User r1 = r5.A02(r1)
            if (r1 == 0) goto L_0x0360
            r6.add(r1)
            goto L_0x0360
        L_0x0374:
            java.lang.String r14 = r0.A15
            if (r14 != 0) goto L_0x037a
            java.lang.String r14 = ""
        L_0x037a:
            java.util.List r1 = r0.A1A
            int r17 = r1.size()
            X.OW6 r13 = new X.OW6
            r15 = r1
            r16 = r6
            r18 = r9
            r13.<init>(r14, r15, r16, r17, r18)
            r0.A0G = r13
            goto L_0x0331
        L_0x038d:
            java.lang.String r0 = "push"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03a9
            java.lang.String r0 = "direct_push_notifications"
            goto L_0x0216
        L_0x0399:
            java.lang.String r0 = "thread"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03a9
            r0 = 23
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x0216
        L_0x03a9:
            java.lang.String r1 = "entry point "
            java.lang.String r0 = " is unexpected."
            java.lang.String r0 = X.002.A0g(r1, r2, r0)
            X.0wb.A03(r10, r0)
            java.lang.String r0 = "unknown"
            goto L_0x0216
        L_0x03b8:
            r2.registerLifecycleListener(r1)
            X.OCM r1 = new X.OCM
            r1.<init>(r12)
            r0.A0J = r1
            com.instagram.direct.visual.DirectVisualMessageViewerController.A0I(r0)
            com.instagram.direct.visual.DirectVisualMessageViewerController.A0H(r0)
            com.instagram.direct.visual.DirectVisualMessageViewerController r1 = r3.A01
            if (r1 == 0) goto L_0x03d0
            X.4mW r0 = r3.A02
            r1.A0P = r0
        L_0x03d0:
            r1 = 2023205818(0x7897abba, float:2.4609995E34)
            goto L_0x00d0
        L_0x03d5:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r22)
            r1 = 1312570715(0x4e3c3d5b, float:7.895344E8)
            goto L_0x03ec
        L_0x03dd:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r22)
            r1 = 194694188(0xb9acc2c, float:5.9625846E-32)
            goto L_0x03ec
        L_0x03e5:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r22)
            r1 = -408834828(0xffffffffe7a1acf4, float:-1.5269829E24)
        L_0x03ec:
            r0 = r25
            X.AnonymousClass0fD.A09(r1, r0)
            throw r2
        L_0x03f2:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r22)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68463NJb.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout;
        int A022 = AnonymousClass0fD.A02(521685194);
        0qQ.A0B(layoutInflater, 0);
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController != null) {
            TouchInterceptorFrameLayout inflate = layoutInflater.inflate(R.layout.fragment_direct_visual_message_viewer, viewGroup, false);
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout");
            directVisualMessageViewerController.viewerContainer = inflate;
            FragmentActivity fragmentActivity = directVisualMessageViewerController.A0e;
            Window window = fragmentActivity.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                0qQ.A07(decorView);
                directVisualMessageViewerController.reelViewerShadowAnimator = new OEL(decorView);
                int dimensionPixelSize = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.ad_tag_max_width) / 2;
                TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = directVisualMessageViewerController.viewerContainer;
                if (touchInterceptorFrameLayout2 != null) {
                    C19700We2 we2 = new C19700We2(touchInterceptorFrameLayout2, new PF8(directVisualMessageViewerController, dimensionPixelSize), 0.75f);
                    directVisualMessageViewerController.A0H = we2;
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout3 = directVisualMessageViewerController.viewerContainer;
                    if (touchInterceptorFrameLayout3 != null) {
                        C317416nE.A00(touchInterceptorFrameLayout3, we2);
                        TouchInterceptorFrameLayout touchInterceptorFrameLayout4 = directVisualMessageViewerController.viewerContainer;
                        if (touchInterceptorFrameLayout4 != null) {
                            touchInterceptorFrameLayout4.requestFocus();
                        }
                        TouchInterceptorFrameLayout touchInterceptorFrameLayout5 = directVisualMessageViewerController.viewerContainer;
                        if (touchInterceptorFrameLayout5 != null) {
                            touchInterceptorFrameLayout5.setOnKeyListener(directVisualMessageViewerController);
                        }
                        touchInterceptorFrameLayout = directVisualMessageViewerController.viewerContainer;
                        if (touchInterceptorFrameLayout == null) {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            touchInterceptorFrameLayout = new View(layoutInflater.getContext());
        }
        AnonymousClass0fD.A09(146073433, A022);
        return touchInterceptorFrameLayout;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1828379056);
        super.onDestroy();
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController != null) {
            AnonymousClass4DH r1 = directVisualMessageViewerController.A0f;
            C230562pp r0 = directVisualMessageViewerController.A0K;
            if (r0 == null) {
                0qQ.A0F("impressionTracker");
                throw AnonymousClass00P.createAndThrow();
            }
            r1.unregisterLifecycleListener(r0);
        }
        AnonymousClass0fD.A09(-894720477, A022);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onDestroyView() {
        IgProgressImageView igProgressImageView;
        IgProgressImageView igProgressImageView2;
        int A022 = AnonymousClass0fD.A02(-1937893490);
        super.onDestroyView();
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController != null) {
            AnonymousClass3E6 r0 = directVisualMessageViewerController.keyboardHeightChangeDetector;
            if (r0 != null) {
                r0.EEH(directVisualMessageViewerController);
            }
            C19700We2 we2 = directVisualMessageViewerController.A0H;
            if (we2 == null) {
                0qQ.A0F("directMediaViewerGestureController");
                throw AnonymousClass00P.createAndThrow();
            }
            we2.destroy();
            OIU oiu = directVisualMessageViewerController.contentHolder;
            if (!(oiu == null || (igProgressImageView2 = oiu.A0J) == null)) {
                igProgressImageView2.A06(R.id.direct_visual_message_viewer_fragment_image_view_id);
            }
            OIU oiu2 = directVisualMessageViewerController.contentHolder;
            if (!(oiu2 == null || (igProgressImageView = oiu2.A0J) == null)) {
                igProgressImageView.A06(R.id.listener_id_for_direct_visual_message_item_viewer_image_binding);
            }
            C67087Mi3 mi3 = directVisualMessageViewerController.A0C;
            if (mi3 != null) {
                mi3.A01 = null;
                mi3.A00 = null;
                mi3.A02 = null;
            }
            directVisualMessageViewerController.A0C = null;
            ? r2 = directVisualMessageViewerController.A0A;
            if (r2 != 0) {
                C71392co r02 = C315596kB.A02;
                C294975nL.A00(r2).A0G();
                View view = directVisualMessageViewerController.contentView;
                if (view != null) {
                    C294975nL.A00(view).A0G();
                    AnonymousClass6g5 r03 = directVisualMessageViewerController.photoTimerController;
                    if (r03 != null) {
                        r03.A02();
                    }
                    C72980PRn pRn = directVisualMessageViewerController.videoPlayer;
                    if (pRn != null) {
                        String A002 = C273654mx.A00(148);
                        C14044Tol tol = pRn.A05;
                        if (tol != null) {
                            tol.A0B(A002);
                            pRn.A05 = null;
                        }
                    }
                    directVisualMessageViewerController.A0s.A00 = null;
                    DirectVisualMessageViewerControllerLifecycleUtil.cleanupReferences(directVisualMessageViewerController);
                    FragmentActivity fragmentActivity = directVisualMessageViewerController.A0e;
                    Window window = fragmentActivity.getWindow();
                    0qQ.A07(window);
                    2db.A07(C66581MXm.A0A(fragmentActivity), window, true);
                    OCM ocm = directVisualMessageViewerController.A0J;
                    if (ocm != null) {
                        ocm.A00.A01();
                    }
                    directVisualMessageViewerController.A0l.A01();
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        AnonymousClass0fD.A09(65631087, A022);
    }

    public final void onPause() {
        String str;
        String str2;
        int A022 = AnonymousClass0fD.A02(-1984695803);
        C68463NJb.super.onPause();
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController != null) {
            OIE oie = directVisualMessageViewerController.A0B;
            if (oie == null) {
                str2 = "directVisualViewerSummaryLogger";
            } else {
                0xI A002 = 0xI.A00(directVisualMessageViewerController.A0v, "direct_story_session_summary");
                A002.A0C("viewer_session_id", oie.A0A);
                A002.A08(Integer.valueOf(oie.A02), "photos_consumed");
                A002.A08(Integer.valueOf(oie.A04), "videos_consumed");
                A002.A0D("reel_session_consumption_list", oie.A0B);
                if (oie.A0C) {
                    str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                } else {
                    str = "0";
                }
                A002.A0C("is_replay", str);
                A002.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, oie.A09);
                A002.A08(Integer.valueOf(oie.A06), "reel_size");
                A002.A0A("time_elapsed", Double.valueOf(((double) (SystemClock.elapsedRealtime() - oie.A07)) / 1000.0d));
                A002.A08(Integer.valueOf(oie.A05), "one_view_consumed");
                A002.A08(Integer.valueOf(oie.A03), "replayable_consumed");
                A002.A08(Integer.valueOf(oie.A01), "permanent_consumed");
                A002.A0A("pause_duration", Double.valueOf(oie.A00));
                DbU.A1R(A002, oie.A08);
                directVisualMessageViewerController.A0W(C273654mx.A00(148));
                AnonymousClass3KQ r1 = directVisualMessageViewerController.A09;
                str2 = "screenshotDetector";
                if (r1 != null) {
                    AnonymousClass3KG r0 = directVisualMessageViewerController.A07;
                    if (r0 != null) {
                        r0.A06(r1);
                        directVisualMessageViewerController.A09 = null;
                    }
                }
                AnonymousClass3KG r02 = directVisualMessageViewerController.A07;
                if (r02 != null) {
                    r02.A04();
                    C67087Mi3 mi3 = directVisualMessageViewerController.A0C;
                    if (mi3 != null) {
                        mi3.A01 = null;
                        mi3.A00 = null;
                        mi3.A02 = null;
                    }
                    UserSession userSession = directVisualMessageViewerController.A0m;
                    1Ng A003 = AnonymousClass1Nd.A00(userSession);
                    A003.A02(directVisualMessageViewerController.A0i, 2Ke.class);
                    A003.A02(directVisualMessageViewerController.A0j, AnonymousClass3EK.class);
                    A003.A02(directVisualMessageViewerController.A0k, 2Kb.class);
                    AnonymousClass3E6 r03 = directVisualMessageViewerController.keyboardHeightChangeDetector;
                    if (r03 != null) {
                        r03.onStop();
                    }
                    C314626ia r04 = directVisualMessageViewerController.A0M;
                    if (r04 == null) {
                        str2 = "reelInteractiveController";
                    } else {
                        r04.A03((C255783ui) null, false, true);
                        EditText editText = directVisualMessageViewerController.composerEditText;
                        if (editText != null) {
                            editText.removeTextChangedListener(directVisualMessageViewerController.composerTextWatcher);
                        }
                        EditText editText2 = directVisualMessageViewerController.composerEditText;
                        if (editText2 != null) {
                            editText2.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                        }
                        if (!directVisualMessageViewerController.A0U) {
                            boolean z = true;
                            if (directVisualMessageViewerController.A0c == 1) {
                                z = false;
                            }
                            DirectVisualMessageViewerController.A0L(directVisualMessageViewerController, 9, z);
                        }
                        C315436jt r05 = directVisualMessageViewerController.A0O;
                        if (r05 == null) {
                            str2 = "appAttributionTooltipHelper";
                        } else {
                            r05.A01 = null;
                            OGO ogo = directVisualMessageViewerController.A0N;
                            if (ogo == null) {
                                str2 = "pollTooltipHelper";
                            } else {
                                ogo.A00 = null;
                                1wY A004 = 1wY.A00(userSession);
                                AnonymousClass4DH r2 = directVisualMessageViewerController.A0f;
                                A004.A08(r2.getModuleName());
                                1y1.A00(userSession).A04(r2.getModuleName());
                                1wY.A00(userSession);
                                11Z.A00();
                                11Z.A00();
                                directVisualMessageViewerController.A0S = false;
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(-1681774056, A022);
    }

    public final void onResume() {
        String str;
        String str2;
        View findViewById;
        int A022 = AnonymousClass0fD.A02(2065144196);
        super.onResume();
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController != null) {
            View view = directVisualMessageViewerController.itemView;
            if (!(view == null || (findViewById = view.findViewById(R.id.viewer_media_view_container)) == null)) {
                findViewById.addOnAttachStateChangeListener(new I9u(directVisualMessageViewerController, 3));
            }
            directVisualMessageViewerController.A0U = false;
            C19700We2 we2 = directVisualMessageViewerController.A0H;
            String str3 = "directMediaViewerGestureController";
            if (we2 != null) {
                we2.A00();
                C19700We2 we22 = directVisualMessageViewerController.A0H;
                if (we22 != null) {
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout = directVisualMessageViewerController.viewerContainer;
                    if (touchInterceptorFrameLayout != null) {
                        C317416nE.A00(touchInterceptorFrameLayout, we22);
                        OIE oie = directVisualMessageViewerController.A0B;
                        if (oie == null) {
                            str3 = "directVisualViewerSummaryLogger";
                        } else {
                            oie.A07 = SystemClock.elapsedRealtime();
                            FragmentActivity fragmentActivity = directVisualMessageViewerController.A0e;
                            Window window = fragmentActivity.getWindow();
                            0qQ.A07(window);
                            2db.A07(C66581MXm.A0A(fragmentActivity), window, false);
                            if (directVisualMessageViewerController.A0R) {
                                directVisualMessageViewerController.A0X("resume");
                            }
                            AnonymousClass3KG r0 = directVisualMessageViewerController.A07;
                            str3 = "screenshotDetector";
                            if (r0 != null) {
                                r0.A03();
                                OW6 ow6 = directVisualMessageViewerController.A0G;
                                if (ow6 != null) {
                                    if (directVisualMessageViewerController.A09 == null && !0qQ.A0K(ow6.A00().A0N, "permanent")) {
                                        if (directVisualMessageViewerController.A07 != null) {
                                            UserSession userSession = directVisualMessageViewerController.A0m;
                                            C254743sy r15 = directVisualMessageViewerController.A0x;
                                            String A012 = ow6.A00().A01();
                                            String str4 = ow6.A00().A0G;
                                            boolean z = ow6.A00().A0X;
                                            AnonymousClass3KQ A002 = AnonymousClass3KG.A00(new C72178Oxn(userSession, directVisualMessageViewerController.A0o, r15, A012, str4, ow6.A00().A0M, z));
                                            directVisualMessageViewerController.A09 = A002;
                                            AnonymousClass3KG r02 = directVisualMessageViewerController.A07;
                                            if (r02 != null) {
                                                r02.A05(A002);
                                            }
                                        }
                                    }
                                    List list = ow6.A03;
                                    int size = list.size();
                                    int i = ow6.A01;
                                    if (size < i) {
                                        UserSession userSession2 = directVisualMessageViewerController.A0m;
                                        2Dm A003 = 1bJ.A00(userSession2);
                                        DirectThreadKey A03 = C66647MaG.A03(directVisualMessageViewerController.A0x);
                                        if (list.isEmpty()) {
                                            str2 = null;
                                        } else {
                                            str2 = ((C68167N3h) C66582MXn.A0r(list)).A0K;
                                        }
                                        List CBt = A003.CBt(A03, str2);
                                        if (CBt != null) {
                                            AnonymousClass2Ep r03 = directVisualMessageViewerController.A0n;
                                            if (r03 != null) {
                                                ArrayList A04 = C271384il.A04(fragmentActivity, userSession2, r03, CBt);
                                                int size2 = i - list.size();
                                                if (size2 > 0) {
                                                    list.addAll(A04.subList(0, Math.min(size2, A04.size())));
                                                }
                                            } else {
                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                            }
                                        }
                                    }
                                    UserSession userSession3 = directVisualMessageViewerController.A0m;
                                    1Ng A004 = AnonymousClass1Nd.A00(userSession3);
                                    A004.A01(directVisualMessageViewerController.A0i, 2Ke.class);
                                    A004.A01(directVisualMessageViewerController.A0j, AnonymousClass3EK.class);
                                    A004.A01(directVisualMessageViewerController.A0k, 2Kb.class);
                                    AnonymousClass3E6 r04 = directVisualMessageViewerController.keyboardHeightChangeDetector;
                                    if (r04 != null) {
                                        r04.DmJ(fragmentActivity);
                                    }
                                    EditText editText = directVisualMessageViewerController.composerEditText;
                                    if (editText != null) {
                                        editText.addTextChangedListener(directVisualMessageViewerController.composerTextWatcher);
                                    }
                                    EditText editText2 = directVisualMessageViewerController.composerEditText;
                                    if (editText2 != null) {
                                        editText2.setOnFocusChangeListener(new C71411OkA(directVisualMessageViewerController, 3));
                                    }
                                    C254743sy r4 = directVisualMessageViewerController.A0x;
                                    if (r4 instanceof DirectThreadKey) {
                                        1XZ A005 = AnonymousClass3F2.A00();
                                        String str5 = userSession3.A06;
                                        DirectThreadKey A042 = C66647MaG.A04(r4);
                                        if (A042 != null) {
                                            str = A042.A00;
                                        } else {
                                            str = null;
                                        }
                                        A005.A02.A04(userSession3, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AnonymousClass7QG.A02(str5, str, (String) null));
                                    }
                                    C315436jt r1 = directVisualMessageViewerController.A0O;
                                    if (r1 == null) {
                                        str3 = "appAttributionTooltipHelper";
                                    } else {
                                        r1.A01 = directVisualMessageViewerController.A10;
                                        OGO ogo = directVisualMessageViewerController.A0N;
                                        if (ogo == null) {
                                            str3 = "pollTooltipHelper";
                                        } else {
                                            ogo.A00 = directVisualMessageViewerController.A0t;
                                            AnonymousClass4DH r12 = directVisualMessageViewerController.A0f;
                                            AnonymousClass34R r42 = new AnonymousClass34R(userSession3, (AnonymousClass34Q) null, r12.getModuleName());
                                            AnonymousClass34L r3 = new AnonymousClass34L(userSession3, r12.getModuleName());
                                            1wY A006 = 1wY.A00(userSession3);
                                            String moduleName = r12.getModuleName();
                                            0qQ.A08(1wY.A0F);
                                            A006.A07(r3, r42, moduleName);
                                            1wY.A00(userSession3);
                                            11Z.A00();
                                            11Z.A00();
                                            AnonymousClass2uJ.A06(fragmentActivity, false);
                                        }
                                    }
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            }
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
            }
            0qQ.A0F(str3);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(932675144, A022);
    }
}
