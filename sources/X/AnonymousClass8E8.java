package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8E8  reason: invalid class name */
public final class AnonymousClass8E8 implements AnonymousClass81E {
    public AnonymousClass8EA A00;
    public boolean A01;
    public Set A02;
    public final C357638Yz A03;
    public final AnonymousClass8F4 A04;
    public final AnonymousClass88R A05;
    public final AnonymousClass80U A06;
    public final Set A07 = new LinkedHashSet();
    public final Set A08 = new LinkedHashSet();
    public final Set A09 = new LinkedHashSet();
    public final Set A0A = new LinkedHashSet();
    public final UserSession A0B;
    public final ClipsCreationViewModel A0C;
    public final Map A0D;
    public final Map A0E;
    public volatile boolean A0F;

    public AnonymousClass8E8(ViewGroup viewGroup, UserSession userSession, C357638Yz r8, AnonymousClass88R r9, AnonymousClass80U r10, ClipsCreationViewModel clipsCreationViewModel, boolean z) {
        double d;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(viewGroup, 2);
        0qQ.A0B(r8, 4);
        0qQ.A0B(r10, 5);
        0qQ.A0B(r9, 6);
        0qQ.A0B(clipsCreationViewModel, 7);
        this.A0B = userSession;
        this.A03 = r8;
        this.A06 = r10;
        this.A05 = r9;
        this.A0C = clipsCreationViewModel;
        Class<C358088aL> cls = C358088aL.class;
        this.A0D = new EnumMap(cls);
        this.A0E = new EnumMap(cls);
        this.A02 = 0sl.A00;
        if (z) {
            r10.A7w(new AnonymousClass8E9(this));
            Context context = viewGroup.getContext();
            0qQ.A07(context);
            boolean A1y = 1Au.A00(userSession).A1y();
            AnonymousClass8EA r4 = new AnonymousClass8EA(context);
            r4.A04 = this;
            r4.A02 = userSession;
            2cs r3 = r4.A0B;
            if (A1y) {
                d = 1.0d;
            } else {
                d = 0.0d;
            }
            r3.A08(d, true);
            this.A00 = r4;
            ((ViewGroup) viewGroup.findViewById(R.id.layout_camera_tool_menu_container)).addView(this.A00);
            AnonymousClass8EK r1 = new AnonymousClass8EK(this);
            r8.A0G.add(r1);
            r8.A07.A01(r1);
            A01(this, (Set) this.A03.A07.A00);
            r8.A0G(new AnonymousClass8F3(this));
            A00(this, (Set) r8.A09.A00);
            AnonymousClass8EA r12 = this.A00;
            if (r12 != null) {
                r12.setVisibility(8);
            }
            AnonymousClass8EA r2 = this.A00;
            if (r2 != null) {
                r2.A06(0, 0, 0.0f);
            }
        }
        this.A04 = new AnonymousClass8F4(this);
    }

    public final void A07(C358088aL r3, QPTooltipAnchor qPTooltipAnchor, C231002qi r5, C230882qT r6) {
        0qQ.A0B(r6, 1);
        AnonymousClass8EA r0 = this.A00;
        if (r0 == null) {
            0kD.A00("CameraToolMenuController", "Attempt to register QP tooltip with menu disabled");
            return;
        }
        View A052 = r0.A05(r3);
        if (A052 != null) {
            r6.A00(A052, qPTooltipAnchor, r5);
        }
    }

    public final void A08(C358088aL r2, 0sP r3) {
        0qQ.A0B(r2, 0);
        A02(new C339627ju(r3), r2);
    }

    public final /* synthetic */ void A7M(Parcelable parcelable) {
    }

    public static final void A00(AnonymousClass8E8 r2, Set set) {
        AnonymousClass8EA r22 = r2.A00;
        if (r22 != null) {
            0qQ.A0B(set, 0);
            AnonymousClass8EL r1 = (AnonymousClass8EL) r22.A0D.get(r22.A03);
            if (r22.A06 == null) {
                return;
            }
            if (r1 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("adapter is null when trying to update camera tools for destination: ");
                sb.append(r22.A03);
                0kD.A00("CameraToolMenu", sb.toString());
                return;
            }
            r1.A09(set);
        }
    }

    public static final void A01(AnonymousClass8E8 r4, Set set) {
        if (!0qQ.A0K(set, r4.A02)) {
            r4.A02 = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C279284yO r1 = (C279284yO) it.next();
                linkedHashMap.put(r1, r4.A03.A07(r1));
            }
            AnonymousClass8EA r12 = r4.A00;
            if (r12 != null) {
                r12.setCameraToolPairings(linkedHashMap, (C279284yO) r4.A03.A08.A00);
            }
            C357638Yz r0 = r4.A03;
            r0.A0H.add(new AnonymousClass8F2(r4));
        }
    }

    public final void A02(C3495480u r3, C358088aL r4) {
        Map map = this.A0D;
        if (!map.containsKey(r4)) {
            map.put(r4, new HashSet());
        }
        Set set = (Set) map.get(r4);
        if (set != null) {
            set.add(r3);
        }
    }

    public final void A03(C3495480u r3, C358088aL r4) {
        Map map = this.A0E;
        if (!map.containsKey(r4)) {
            map.put(r4, r3);
        } else {
            0kD.A00("CameraToolMenuController", "Only one UI delegate can exist for each tool");
        }
    }

    public final void A04(C279284yO r4, C358088aL r5, String str) {
        AnonymousClass8EA r0 = this.A00;
        if (r0 != null) {
            LinkedHashMap linkedHashMap = r0.A0D;
            linkedHashMap.values();
            AnonymousClass8EL r02 = (AnonymousClass8EL) linkedHashMap.get(r4);
            if (r02 == null) {
                0kD.A00("CameraToolMenu", "no adapter available for given destination");
                return;
            }
            for (Map.Entry entry : r02.A0I.entrySet()) {
                Object key = entry.getKey();
                View view = (View) entry.getValue();
                if (key == r5 && view != null) {
                    view.setContentDescription(str);
                }
            }
        }
    }

    public final void A05(C279284yO r5, C358088aL r6, String str) {
        AnonymousClass8EA r0 = this.A00;
        if (r0 != null) {
            LinkedHashMap linkedHashMap = r0.A0D;
            linkedHashMap.values();
            AnonymousClass8EL r02 = (AnonymousClass8EL) linkedHashMap.get(r5);
            if (r02 == null) {
                0kD.A00("CameraToolMenu", "no adapter available for given destination");
                return;
            }
            for (Map.Entry entry : r02.A0I.entrySet()) {
                Object key = entry.getKey();
                CameraToolMenuItem cameraToolMenuItem = (CameraToolMenuItem) entry.getValue();
                if (key == r6 && cameraToolMenuItem != null) {
                    cameraToolMenuItem.A08 = str;
                    cameraToolMenuItem.A01 = cameraToolMenuItem.A0M.measureText(String.valueOf(str));
                    cameraToolMenuItem.invalidate();
                }
            }
        }
    }

    public final void A06(C358088aL r18, CameraToolMenuItem cameraToolMenuItem) {
        C3495480u r0;
        String str;
        C358088aL r13 = r18;
        boolean A052 = C352618Eb.A05(r13);
        if (A052) {
            C357638Yz r8 = this.A03;
            if (!r8.A0V(r13)) {
                UserSession userSession = this.A0B;
                C3493780d r7 = r8.A0B;
                C3494680m r5 = r8.A08;
                C279284yO r6 = (C279284yO) r5.A00;
                AnonymousClass80H r3 = r8.A01;
                if (r3 == null) {
                    str = "cameraConfigurationSetup";
                } else {
                    Map map = r8.A0F;
                    28D r02 = r8.A00;
                    if (r02 == null) {
                        str = "entryPoint";
                    } else {
                        Iterator it = r7.A00(r02, r3, r6, map).A00().iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                                break;
                            }
                            int i2 = i + 1;
                            if (r13 == it.next()) {
                                break;
                            }
                            i = i2;
                        }
                        int size = ClipsCreationViewModel.A00(this.A0C).A01.size();
                        C279284yO r1 = (C279284yO) r5.A00;
                        C371088xY r12 = C371088xY.CAMERA_TOOL;
                        0qQ.A0B(r1, 4);
                        27r A012 = 27p.A01(userSession);
                        C279294yP r11 = r1.A00;
                        List singletonList = Collections.singletonList(r12);
                        0qQ.A07(singletonList);
                        A012.A0F.A0S(r11, r12, r13, singletonList, i, size);
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            } else if (C352618Eb.A04(r13) != null) {
                UserSession userSession2 = this.A0B;
                Integer A042 = C352618Eb.A04(r13);
                27r A013 = 27p.A01(userSession2);
                int A014 = 2AL.A01(A042);
                29Z r52 = A013.A0F;
                0wc r32 = r52.A01;
                0Aj A002 = r32.A00(r32.A00, "ig_camera_ui_tool_click");
                if (A002.isSampled()) {
                    A002.A8M(AnonymousClass80P.SELECT_FORMAT, "tool_type");
                    A002.AAJ("legacy_falco_event_name", "IG_CAMERA_SELECT_FORMAT_TOGGLE");
                    AnonymousClass283 r4 = r52.A04;
                    String str2 = r4.A0L;
                    if (str2 == null) {
                        str2 = "";
                    }
                    A002.AAJ("camera_session_id", str2);
                    int i3 = 2;
                    if (r4.A01 != 2) {
                        i3 = 1;
                    }
                    A002.A8k("camera_position", Integer.valueOf(i3));
                    A002.A9F("capture_format_index", Long.valueOf((long) A014));
                    A002.A8M(r52.A0I(), "capture_type");
                    A002.A8M(r4.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A002.A8k("event_type", 2);
                    A002.A8M(r4.A0A, "media_type");
                    A002.AAJ("module", 27x.A08.getModuleName());
                    A002.A8M(C59725JVj.PRE_CAPTURE, "surface");
                    A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                    A002.Cgf();
                }
            }
        }
        for (C62320sa invoke : this.A0A) {
            invoke.invoke();
        }
        Map map2 = this.A0D;
        CameraToolMenuItem cameraToolMenuItem2 = cameraToolMenuItem;
        if (map2.containsKey(r13)) {
            Set<C3495480u> set = (Set) map2.get(r13);
            if (set != null) {
                for (C3495480u onChanged : set) {
                    onChanged.onChanged(cameraToolMenuItem2);
                }
                return;
            }
            return;
        }
        if (A052 && C358088aL.A0g != r13) {
            this.A03.A0L(r13);
        }
        Map map3 = this.A0E;
        if (map3.containsKey(r13) && (r0 = (C3495480u) map3.get(r13)) != null) {
            r0.onChanged(cameraToolMenuItem2);
        }
    }

    public final boolean A09(Drawable drawable, C279284yO r6, C358088aL r7) {
        AnonymousClass8EA r0 = this.A00;
        if (r0 != null) {
            LinkedHashMap linkedHashMap = r0.A0D;
            linkedHashMap.values();
            AnonymousClass8EL r02 = (AnonymousClass8EL) linkedHashMap.get(r6);
            if (r02 == null) {
                0kD.A00("CameraToolMenu", "no adapter available for given destination");
            } else {
                for (Map.Entry entry : r02.A0I.entrySet()) {
                    Object key = entry.getKey();
                    CameraToolMenuItem cameraToolMenuItem = (CameraToolMenuItem) entry.getValue();
                    if (key == r7) {
                        if (cameraToolMenuItem == null) {
                            return false;
                        }
                        cameraToolMenuItem.A05 = drawable;
                        cameraToolMenuItem.A06 = null;
                        cameraToolMenuItem.invalidate();
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public final /* synthetic */ Parcelable ANX() {
        return null;
    }
}
