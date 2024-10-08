package com.facebook.graphservice.interfaces;

import X.AnonymousClass1EO;
import com.facebook.tigon.TigonErrorException;

public interface GraphQLService {

    public interface DataCallbacks {
        void onError(TigonErrorException tigonErrorException, Summary summary);

        void onUpdate(Tree tree, Summary summary);
    }

    public interface OperationCallbacks {
        void onError(TigonErrorException tigonErrorException);

        void onSuccess();
    }

    public interface Token extends AnonymousClass1EO {
        void cancel();
    }
}
