package com.facebook.graphservice.interfaces;

import X.C13421Ta6;
import X.RLT;
import com.google.common.util.concurrent.ListenableFuture;

public interface GraphQLConsistency extends GraphQLBaseConsistency {
    ListenableFuture applyOptimistic(Tree tree, Tree tree2, RLT rlt);

    ListenableFuture applyOptimisticBuilder(C13421Ta6 ta6, Tree tree, RLT rlt);

    ListenableFuture publish(Tree tree);

    ListenableFuture publishBuilder(C13421Ta6 ta6);

    ListenableFuture publishBuilderWithFullConsistency(C13421Ta6 ta6);

    ListenableFuture publishWithFullConsistency(Tree tree);
}
