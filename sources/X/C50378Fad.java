package X;

import android.os.Bundle;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;

/* renamed from: X.Fad  reason: case insensitive filesystem */
public final class C50378Fad implements C51867G5e {
    public final ChannelCreationFlowExtraArgs A00;

    public final void Cos(Bundle bundle) {
        String str;
        0qQ.A0B(bundle, 0);
        ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs = this.A00;
        bundle.putParcelable("direct_channel_creation_flow_extra_args", channelCreationFlowExtraArgs);
        String str2 = channelCreationFlowExtraArgs.A01;
        if (str2 != null && (str = channelCreationFlowExtraArgs.A02) != null) {
            bundle.putString("school_social_channel_school_fbid", str2);
            bundle.putString("school_social_channel_school_name", str);
        }
    }

    public C50378Fad(ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs) {
        this.A00 = channelCreationFlowExtraArgs;
    }
}
