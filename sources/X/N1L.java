package X;

import com.facebook.assistant.stella.ipc.common.request.IpcRequest;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableMap;

public abstract class N1L extends IpcRequest {
    public final Class A00;

    public N1L(C68378NEe nEe, Class cls) {
        super(nEe, ImmutableMap.of(TraceFieldType.RequestID, "", "protocol_version", Integer.valueOf(DbW.A1Y(cls) ? 1 : 0)));
        this.A00 = cls;
    }
}
