package com;


import io.qameta.allure.Epic;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.quality.Strictness;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
@Epic("Repository")
class RepositoryTest {

    @Test
    void allureIssue() {
        Repository repository = mock(Repository.class, withSettings().strictness(Strictness.LENIENT));
        when(repository.getReferenceById("id")).thenReturn("Kaixo!");
    }

}
