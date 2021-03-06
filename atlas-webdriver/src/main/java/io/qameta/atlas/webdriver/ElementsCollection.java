package io.qameta.atlas.webdriver;

import io.qameta.atlas.core.api.Timeout;
import io.qameta.atlas.webdriver.extension.ExtractMethodExtension;
import io.qameta.atlas.webdriver.extension.ShouldMethodExtension;
import io.qameta.atlas.webdriver.extension.WaitUntilMethodExtension;
import org.hamcrest.Matcher;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Atlas Web Element Collection.
 * @param <E> the type of elements in this collection
 */
public interface ElementsCollection<E> extends List<E> {

    /**
     * This method handled by the {@link io.qameta.atlas.webdriver.extension.FilterCollectionExtension}.
     */
    ElementsCollection<E> filter(Predicate<E> predicate);

    /**
     * This method handled by the {@link ExtractMethodExtension}.
     */
    <R> ElementsCollection<R> extract(Function<E, R> function);

    /**
     * This method handled by the {@link ShouldMethodExtension}.
     */
    ElementsCollection<E> should(Matcher matcher);

    /**
     * This method handled by the {@link ShouldMethodExtension}.
     */
    ElementsCollection<E> should(String message, Matcher matcher);

    /**
     * This method handled by the {@link WaitUntilMethodExtension}.
     */
    ElementsCollection<E> waitUntil(Matcher matcher);

    /**
     * This method handled by the {@link WaitUntilMethodExtension}.
     */
    ElementsCollection<E> waitUntil(Matcher matcher, @Timeout Integer timeoutInSeconds);

    /**
     * This method handled by the {@link WaitUntilMethodExtension}.
     */
    ElementsCollection<E> waitUntil(String message, Matcher matcher);

    /**
     * This method handled by the {@link WaitUntilMethodExtension}.
     */
    ElementsCollection<E> waitUntil(String message, Matcher matcher, @Timeout Integer timeoutInSeconds);
}
