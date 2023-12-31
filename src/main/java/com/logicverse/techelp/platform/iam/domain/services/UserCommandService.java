package com.logicverse.techelp.platform.iam.domain.services;

import com.logicverse.techelp.platform.iam.domain.model.aggregates.User;
import com.logicverse.techelp.platform.iam.domain.model.commands.SignInCommand;
import com.logicverse.techelp.platform.iam.domain.model.commands.SignUpCommand;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.Optional;

/**
 * User command service.
 * <p>
 *     This service is responsible for handling user commands.
 * </p>
 */
public interface UserCommandService {
    /**
     * This method handles the {@link SignUpCommand} command.
     *
     * @param command the {@link SignUpCommand} command.
     * @return the {@link User} entity.
     */
    Optional<User> handle(SignUpCommand command);
    /**
     * This method handles the {@link SignInCommand} command.
     *
     * @param command the {@link SignInCommand} command.
     * @return the {@link User} entity.
     */
    Optional<ImmutablePair<User, String>> handle(SignInCommand command);
}
