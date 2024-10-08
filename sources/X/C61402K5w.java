package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.io.File;
import java.io.IOException;

/* renamed from: X.K5w  reason: case insensitive filesystem */
public final class C61402K5w extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ClipsEditMetadataFragment";
    public View A00;
    public ClipsEditMetadataController A01;
    public String A02;
    public boolean A03;
    public int A04;
    public String A05;
    public String A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final 1wn A08 = new LgJ(this, 17);
    public final 1wn A09 = new LgJ(this, 18);
    public final 1wn A0A = new LgJ(this, 19);

    public final String getModuleName() {
        return C273654mx.A00(253);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final boolean onBackPressed() {
        ClipsEditMetadataController clipsEditMetadataController = this.A01;
        if (clipsEditMetadataController == null) {
            0qQ.A0F("clipsEditMetadataController");
            throw AnonymousClass00P.createAndThrow();
        }
        File file = clipsEditMetadataController.A0L;
        if (file == null) {
            return false;
        }
        file.delete();
        return false;
    }

    public final void configureActionBar(2da r4) {
        C59922Jbl A002 = C59922Jbl.A00(r4);
        C59922Jbl.A02(DbV.A05(this), A002, 2131961455);
        ActionButton A003 = C59904JbT.A00(new LY3((Object) this, 32), r4, A002);
        this.A00 = A003;
        A003.setEnabled(this.A03);
    }

    public final void onActivityCreated(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(956164012);
        C61402K5w.super.onActivityCreated(bundle);
        IgFragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof BaseFragmentActivity) {
            requireActivity.registerOnActivityResultListener(new C15681Ugm(this, 3));
        }
        AnonymousClass0fD.A09(1074920836, A022);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        LFL lfl;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            if (i != 16) {
                if (i == 98) {
                    ClipsEditMetadataController clipsEditMetadataController = this.A01;
                    if (clipsEditMetadataController != null) {
                        String stringExtra = intent.getStringExtra("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_ID");
                        if ("not_funded".equals(stringExtra)) {
                            stringExtra = null;
                        }
                        clipsEditMetadataController.A0N = stringExtra;
                        ClipsEditMetadataController.A07(clipsEditMetadataController);
                        ClipsEditMetadataController.A06(clipsEditMetadataController);
                        return;
                    }
                    0qQ.A0F("clipsEditMetadataController");
                    throw AnonymousClass00P.createAndThrow();
                } else if (i != 1004) {
                    return;
                }
            }
            ClipsEditMetadataController clipsEditMetadataController2 = this.A01;
            if (clipsEditMetadataController2 != null) {
                if (i != 1004 || (lfl = clipsEditMetadataController2.A0B) == null) {
                    clipsEditMetadataController2.A02 = C63550Kyz.A00.A04(intent, clipsEditMetadataController2.A14);
                    clipsEditMetadataController2.A0I = C64182LSo.A00(intent);
                    C63505KyG.A00(clipsEditMetadataController2.A02, clipsEditMetadataController2.A0z);
                    ClipsEditMetadataController.A0C(clipsEditMetadataController2);
                    return;
                }
                lfl.A00(intent);
                return;
            }
            0qQ.A0F("clipsEditMetadataController");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1164937943);
        C61402K5w.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = C320236s2.A01(requireArguments, "args_media_id");
        this.A04 = requireArguments.getInt("args_media_index");
        requireArguments.getBoolean("args_is_feed_preview_entrypoint");
        this.A06 = requireArguments.getString("args_viewer_session_id");
        this.A05 = requireArguments.getString("args_viewer_init_media_id");
        String string = requireArguments.getString("args_comment_poll");
        C272024jy r8 = null;
        if (string != null) {
            try {
                r8 = C271984ju.parseFromJson(16P.A00(string));
            } catch (IOException e) {
                AnonymousClass7TF.A19(0wj.A01.AEf(__redex_internal_original_name, 817902720), DialogModule.KEY_MESSAGE, "Failed to deserialize Poll from ClipsEditMetadata", e);
            }
        }
        AnonymousClass0eM r0 = this.A07;
        UserSession A0l = AnonymousClass7TE.A0l(r0);
        String str = this.A02;
        if (str == null) {
            0qQ.A0F("mediaId");
            throw AnonymousClass00P.createAndThrow();
        }
        ClipsEditMetadataController clipsEditMetadataController = new ClipsEditMetadataController(this, this, A0l, r8, this, this, str);
        this.A01 = clipsEditMetadataController;
        registerLifecycleListener(clipsEditMetadataController);
        1Ng A0R = DbX.A0R(r0);
        A0R.A01(this.A0A, C64648Lfa.class);
        A0R.A01(this.A09, C64629LfH.class);
        A0R.A01(this.A08, C64679Lg6.class);
        AnonymousClass0fD.A09(1341847007, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-998291640);
        0qQ.A0B(layoutInflater, 0);
        boolean A002 = JUO.A00(AnonymousClass7TE.A0l(this.A07));
        int i = R.layout.layout_clips_edit_fragment;
        if (A002) {
            i = R.layout.layout_clips_edit_fragment_v2;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        AnonymousClass0fD.A09(645387891, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(220950576);
        super.onDestroy();
        1Ng A0R = DbX.A0R(this.A07);
        A0R.A02(this.A0A, C64648Lfa.class);
        A0R.A02(this.A09, C64629LfH.class);
        A0R.A02(this.A08, C64679Lg6.class);
        AnonymousClass0fD.A09(-527473095, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1847578807);
        C61402K5w.super.onPause();
        ClipsEditMetadataController clipsEditMetadataController = this.A01;
        if (clipsEditMetadataController == null) {
            0qQ.A0F("clipsEditMetadataController");
            throw AnonymousClass00P.createAndThrow();
        }
        clipsEditMetadataController.A0K();
        Window A0G = DbV.A0G(this);
        if (A0G != null) {
            A0G.setSoftInputMode(0);
            AnonymousClass0fD.A09(928097749, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-25945516, A022);
        throw A0y;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(269132714);
        super.onResume();
        Window A0G = DbV.A0G(this);
        if (A0G != null) {
            A0G.setSoftInputMode(16);
            AnonymousClass0fD.A09(-534979512, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-1215584137, A022);
        throw A0y;
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-669937733);
        C61402K5w.super.onStop();
        ClipsEditMetadataController clipsEditMetadataController = this.A01;
        if (clipsEditMetadataController == null) {
            0qQ.A0F("clipsEditMetadataController");
            throw AnonymousClass00P.createAndThrow();
        }
        clipsEditMetadataController.A0K();
        AnonymousClass0fD.A09(-217978679, A022);
    }
}
