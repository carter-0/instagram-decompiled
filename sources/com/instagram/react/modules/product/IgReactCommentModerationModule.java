package com.instagram.react.modules.product;

import X.0lg;
import X.0wb;
import X.1ES;
import X.1NY;
import X.1OC;
import X.1XP;
import X.1XY;
import X.AnonymousClass000;
import X.AnonymousClass7TE;
import X.C13904TjR;
import X.C18773W0w;
import X.C20326WpN;
import X.C46367Ddj;
import X.C8761R8m;
import X.C8766R8r;
import X.DbU;
import X.DbW;
import X.DbY;
import X.JTO;
import X.QZK;
import X.VT7;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.model.comments.ParcelableCommenterDetails;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = "IGCommentModerationReactModule")
public class IgReactCommentModerationModule extends NativeIGCommentModerationReactModuleSpec {
    public static final String ERROR_SERVER_ERR = "E_SERVER_ERR";
    public static final String MODULE_NAME = "IGCommentModerationReactModule";
    public 0lg mSession;

    public void fetchBlockedCommenters(C13904TjR tjR) {
        tjR.resolve((Object) null);
    }

    public void fetchCommentAudienceControlType(C13904TjR tjR) {
        tjR.resolve((Object) null);
    }

    public void fetchCommentCategoryFilterDisabled(C13904TjR tjR) {
        tjR.resolve((Object) null);
    }

    public void fetchCommentFilter(C13904TjR tjR) {
        tjR.resolve((Object) null);
    }

    public void fetchCommentFilterKeywords(C13904TjR tjR) {
        tjR.resolve((Object) null);
    }

    public void fetchCurrentUser(C13904TjR tjR) {
        tjR.resolve((Object) null);
    }

    public String getName() {
        return "IGCommentModerationReactModule";
    }

    public static ParcelableCommenterDetails getParcelableCommenterDetails(HashMap hashMap) {
        return new ParcelableCommenterDetails((String) hashMap.get(C46367Ddj.A00()), (String) hashMap.get("full_name"), (String) hashMap.get("profile_pic_url"), (String) hashMap.get("profile_pic_id"), JTO.A00(hashMap.get("pk")), AnonymousClass7TE.A1a(hashMap.get("is_verified")), AnonymousClass7TE.A1a(hashMap.get("is_private")));
    }

    private void scheduleTask(1OC r3, C13904TjR tjR) {
        r3.A00 = new C8766R8r(8, this, tjR);
        1ES.A03(r3);
    }

    public void setBlockedCommenters(ReadableMap readableMap, C13904TjR tjR) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (readableMap.hasKey("block")) {
                jSONObject.put("block", new JSONArray(readableMap.getArray("block").toArrayList()));
            }
            if (readableMap.hasKey("unblock")) {
                jSONObject.put("unblock", new JSONArray(readableMap.getArray("unblock").toArrayList()));
            }
            1NY A0N = DbU.A0N(this.mSession);
            A0N.A0A("accounts/set_blocked_commenters/");
            A0N.AA0("commenter_block_status", jSONObject.toString());
            A0N.A0R(1XP.class, 1XY.class);
            A0N.A9m("container_module", "block_commenters");
            scheduleTask(DbW.A0K(A0N), tjR);
        } catch (JSONException e) {
            0wb.A06("IgReactCommentModerationModule", "Failed to send block commenter request", e);
        }
    }

    public void setCommentAudienceControlType(String str, C13904TjR tjR) {
        1NY A0N = DbU.A0N(this.mSession);
        A0N.A0A("accounts/set_comment_audience_control_type/");
        A0N.A9m("audience_control", str);
        A0N.A0R(1XP.class, 1XY.class);
        A0N.A0R = true;
        1OC A0M = A0N.A0M();
        A0M.A00 = new C8761R8m(tjR, this, str, 1);
        1ES.A03(A0M);
    }

    public void setCommentCategoryFilterDisabled(boolean z, C13904TjR tjR) {
        String str;
        1NY A0N = DbU.A0N(this.mSession);
        A0N.A0A("accounts/set_comment_category_filter_disabled/");
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        A0N.A9m("disabled", str);
        scheduleTask(DbY.A0N(A0N, 1XP.class, 1XY.class), tjR);
    }

    public void setCustomKeywords(String str, C13904TjR tjR) {
        1NY A0N = DbU.A0N(this.mSession);
        A0N.A0A(AnonymousClass000.A00(1068));
        A0N.A9m("keywords", str);
        scheduleTask(DbY.A0N(A0N, 1XP.class, 1XY.class), tjR);
    }

    public void setCustomKeywordsWithDisabled(String str, boolean z, C13904TjR tjR) {
        1NY A0N = DbU.A0N(this.mSession);
        A0N.A0A(AnonymousClass000.A00(1068));
        A0N.A9m("keywords", str);
        A0N.A0H("disabled", z);
        scheduleTask(DbY.A0N(A0N, 1XP.class, 1XY.class), tjR);
    }

    public void setUseDefaultKeywords(boolean z, C13904TjR tjR) {
        String str;
        1NY A0N = DbU.A0N(this.mSession);
        A0N.A0A(AnonymousClass000.A00(1067));
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        A0N.A9m(AnonymousClass000.A00(4638), str);
        scheduleTask(DbY.A0N(A0N, 1XP.class, 1XY.class), tjR);
    }

    public IgReactCommentModerationModule(QZK qzk, 0lg r2) {
        super(qzk);
        this.mSession = r2;
    }

    public void openCommenterBlockingViewControllerWithReactTag(double d, ReadableArray readableArray, Callback callback) {
        FragmentActivity currentActivity = getCurrentActivity();
        currentActivity.getClass();
        FragmentActivity fragmentActivity = currentActivity;
        ArrayList arrayList = new ArrayList();
        Iterator it = readableArray.toArrayList().iterator();
        while (it.hasNext()) {
            arrayList.add(getParcelableCommenterDetails((HashMap) it.next()));
        }
        C18773W0w.A01(new C20326WpN(fragmentActivity, new VT7(callback, this), this, arrayList));
    }
}
